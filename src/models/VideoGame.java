package models;

import models.auxilaryModels.Genre;
import models.auxilaryModels.Language;
import models.auxilaryModels.MyDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class VideoGame {
    private String title;
    private double price;
    private ArrayList<Genre> genres;
    private MyDate releaseDate;
    private String countryOfOrigin; //страна-производитель
    private ArrayList<Language> languages;
    private ArrayList<String> activationRegions;
    private GamePlatform gamePlatform;
    private String developer;
    private Map<String, String> estimations;

    public VideoGame(String title, double price, ArrayList<Genre> genres, MyDate releaseDate,
                     String countryOfOrigin, ArrayList<Language> languages,
                     ArrayList<String> activationRegions, GamePlatform gamePlatform, String developer,
                     Map<String, String> estimations) {
        this.title = title;
        this.price = price;
        this.genres = genres;
        this.releaseDate = releaseDate;
        this.countryOfOrigin = countryOfOrigin;
        this.languages = languages;
        this.activationRegions = activationRegions;
        this.gamePlatform = gamePlatform;
        this.developer = developer;
        this.estimations = estimations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public MyDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(MyDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getActivationRegions() {
        return activationRegions;
    }

    public void setActivationRegions(ArrayList<String> activationRegions) {
        this.activationRegions = activationRegions;
    }

    public GamePlatform getGamePlatform() {
        return gamePlatform;
    }

    public void setGamePlatform(GamePlatform gamePlatform) {
        this.gamePlatform = gamePlatform;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Map<String, String> getEstimations() {
        return estimations;
    }

    public void setEstimations(Map<String, String> estimations) {
        this.estimations = estimations;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %s, Жанры: %s, Дата релиза: %s, Страна: %s, Языки: %s, " +
                        "Регион активации: %s, Платформа: %s, Разработчик: %s, Оценки: %s", this.title, this.price,
                this.genres.toString(), this.releaseDate, this.countryOfOrigin, this.languages.toString(),
                this.activationRegions.toString(), this.gamePlatform, this.developer, Arrays.toString(this.estimations.entrySet().toArray()));
    }
    public boolean equals(Object obj) {
        VideoGame comparedGame = (VideoGame) obj;
        return this.title == comparedGame.title;
    }
    public int hashCode() {
        return (int) Math.round(price);
    }
}
