package hpn.service;

import hpn.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getOrders();


    Order getOrderByID(long id);

    void add(Order newOrder);
    void remove(Order order);
    void update();
    boolean exists(long id);
}
