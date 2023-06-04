package models.extend;

import models.VideoGame;

public class Order {
    private Customer customer;
    private VideoGame videoGame;

    public Customer getCustomer() {
        return customer;
    }

    public VideoGame getVideoGame() {
        return videoGame;
    }

    public Order(Customer customer, VideoGame videoGame) {
        this.customer = customer;
        this.videoGame = videoGame;
    }

    @Override
    public String toString() {
        return String.format("%s. \nЗаказчик: %s.", this.videoGame, this.customer);
    }
}
