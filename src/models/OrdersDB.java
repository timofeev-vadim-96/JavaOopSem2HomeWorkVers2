package models;

import models.extend.Order;

import java.time.LocalDateTime;
import java.util.ArrayDeque;

public class OrdersDB implements MarketBehaviour <OrdersDB, Order>{
    private ArrayDeque<Order> dequeDataBase;

    public OrdersDB() {
        dequeDataBase = new ArrayDeque<>();
    }

    @Override
    public void addOrder(Order inputOrder){
        dequeDataBase.addLast(inputOrder);
    }

    @Override
    public void issueOrder() {
        System.out.printf("Заказ выдан %s. \nИнфо о заказе: %s\n", LocalDateTime.now(), dequeDataBase.pollFirst());
    }

    @Override
    public OrdersDB update(Order inputOrder) {
        addOrder(inputOrder);
        issueOrder();
        return this;
    }
}
