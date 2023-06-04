package models;

import models.extend.Order;

public interface MarketBehaviour <T, V>{
    // T - Market's type
    // V - Order's type
    void addOrder(V order);
    void issueOrder();
    T update(V order);
}
