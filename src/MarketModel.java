import models.OrdersDB;
import models.auxilaryModels.MyDate;
import models.VideoGame;
import models.extend.Admin;
import models.extend.Order;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MarketModel {
    private String title;
    private String specification;
    private MyDate foundationDate;
    private Admin creator;
    private ArrayList<VideoGame> gameCatalog;
    private OrdersDB ordersDB;

    public MarketModel() {
        this.title = "GB Market";
        this.specification = "Video games";
        this.foundationDate = new MyDate(2023, 06, 02);
        this.creator = new Admin("Вадим", "Тимофеев", 123);
        gameCatalog = new ArrayList<VideoGame>();
        ordersDB = new OrdersDB();
    }
    public MarketModel addGame(VideoGame newGame){
        gameCatalog.add(newGame);
        System.out.printf("%s успешно добавлена в каталог!\n", newGame.getTitle());
        return this;
    }
    public void removeGame(int index){
        if (index < gameCatalog.size()) {
            String gameTitle = gameCatalog.get(index).getTitle();
            gameCatalog.remove(index);
            System.out.printf("Игра \"%s\" успешно удалена из каталога.\n", gameTitle);
        } else System.out.printf("Игра с id <%s> не найдена.\n", index);

    }
    public String removeGameWithTitle(String titleToRemove) {
        for (int i = 0; i < gameCatalog.size(); i++) {
            if (gameCatalog.get(i).getTitle().toLowerCase().contains(titleToRemove.toLowerCase())) {
                String tempTitle = gameCatalog.get(i).getTitle();
                gameCatalog.remove(i);
                return String.format("Игра с названием \"%s\" успешно удалена из каталога.", tempTitle);
            }
        }
        return String.format("Игра с названием %s не найдена в каталоге.", titleToRemove);
    }

    public void showAllGames() {
        System.out.println("Список доступных игр: ");
        for (int i = 0; i < gameCatalog.size(); i++) {
            System.out.printf("Id: %s. %s\n", i, gameCatalog.get(i));
        }
    }

    @Override
    public String toString() {
        return String.format("Онлайн-магазин: %s. Продаем: %s. Работаем с: %s. Основатель: %s.\n",
                this.title, this.specification, this.foundationDate, this.creator);
    }

    public void getInfo(){
        System.out.println("Информация о онлайн-магазине: " + this);
    }

    public void buyGame(Order order){
        ordersDB.update(order);
    }

    public VideoGame getGame(int id) {
        try{
            return gameCatalog.get(id);
        } catch (NoSuchElementException exception){
            throw new NoSuchElementException(exception);
        }
    }
}
