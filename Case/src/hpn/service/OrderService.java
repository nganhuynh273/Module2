package hpn.service;

import hpn.model.Order;


import java.util.ArrayList;
import java.util.List;

public class OderService implements IOderService {
    @Override
    public Order getOrderByID(long id) {
        List<Order> orderList = getOrders();
        for (Order orders : orderList) {
            if (orders.getOrderID() == id) {
                return orders;
            }
        }
        return null;
    }

    @Override
    public boolean exists(long id) {
        return getOrderByID(id) != null;
    }
