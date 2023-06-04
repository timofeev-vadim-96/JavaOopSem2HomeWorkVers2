//Домашнее задание в файле TechnicalSpecificationTask.txt

import models.*;
import models.auxilaryModels.*;
import models.extend.Customer;
import models.extend.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MarketModel gameStore = new MarketModel();
        gameStore.getInfo();
        gameStore.addGame(createElderRing()).addGame(createHorizonZeroDawn());
        gameStore.showAllGames();
        gameStore.removeGame(0);
        System.out.println(gameStore.removeGameWithTitle("Horizon"));
        gameStore.addGame(createElderRing()).addGame(createHorizonZeroDawn());
        gameStore.buyGame(new Order(new Customer("Иван", "Иванов",
                new MyDate(1995, 01, 11), "г. Санкт-Петербург", "+79111111111"),
                gameStore.getGame(1)));
    }

    //Создаем парочку игр для каталога:

    //ELDER RING
    public static VideoGame createElderRing() {
        ArrayList<Genre> ElderRingGengres = new ArrayList<>();
        ElderRingGengres.add(Genre.Экшен);
        ElderRingGengres.add(Genre.РПГ);

        ArrayList<Language> ElderRingLanguages = new ArrayList<>();
        ElderRingLanguages.add(Language.Russian);
        ElderRingLanguages.add(Language.Ukrainian);
        ElderRingLanguages.add(Language.English);

        ArrayList<String> ElderRingActivationRegions = new ArrayList<>();
        ElderRingActivationRegions.add("Россия");
        ElderRingActivationRegions.add("Украина");
        ElderRingActivationRegions.add("СНГ");

        Map<String, String> ElderRingEstimation = new HashMap<>();
        ElderRingEstimation.put("GabeStore", "4.3");
        ElderRingEstimation.put("Metacritic", "95");

        VideoGame ElderRing = new VideoGame("ELDER RING", 3999.00, ElderRingGengres,
                new MyDate(2022, 02, 25), "Япония", ElderRingLanguages,
                ElderRingActivationRegions, GamePlatform.PC, "FromSoftware", ElderRingEstimation);
        return ElderRing;
    }

    //HORIZON ZERO DAWN
    public static VideoGame createHorizonZeroDawn(){
        ArrayList<Genre> HorizonZeroDawnGenres = new ArrayList<>();
        HorizonZeroDawnGenres.add(Genre.Экшен);
        HorizonZeroDawnGenres.add(Genre.РПГ);
        HorizonZeroDawnGenres.add(Genre.Приключения);

        ArrayList<Language> HorizonZeroDawnLanguages = new ArrayList<>();
        HorizonZeroDawnLanguages.add(Language.Russian);
        HorizonZeroDawnLanguages.add(Language.Ukrainian);
        HorizonZeroDawnLanguages.add(Language.English);

        ArrayList<String> HorizonZeroDawnActivationRegions = new ArrayList<>();
        HorizonZeroDawnActivationRegions.add("Россия");
        HorizonZeroDawnActivationRegions.add("Украина");
        HorizonZeroDawnActivationRegions.add("СНГ");

        Map<String, String> HorizonZeroDawnEstimation = new HashMap<>();
        HorizonZeroDawnEstimation.put("GabeStore", "4.6");
        HorizonZeroDawnEstimation.put("Metacritic", "84");

        VideoGame HorizonZeroDawn = new VideoGame("HORIZON ZERO DAWN", 1499.00, HorizonZeroDawnGenres,
                new MyDate(2022, 02, 25), "Япония", HorizonZeroDawnLanguages,
                HorizonZeroDawnActivationRegions, GamePlatform.PC, "FromSoftware", HorizonZeroDawnEstimation);
        return HorizonZeroDawn;
    }
}