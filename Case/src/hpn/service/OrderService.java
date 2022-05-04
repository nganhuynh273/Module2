package hpn.service;

import hpn.model.Order;
import hpn.utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements IOrderService {
    List<Order> orders = new ArrayList<>();
    public static String path = "data/order.csv";
//    private static OrderItemService orderItemService = new OrderItemService();
    @Override
    public List<Order> getOrders() {
        List<Order> newOrders = new ArrayList<>();
        List<String> records = CSVUtils.read(path);
        for (String record : records) {
            newOrders.add(new Order(record));
        }
        return orders = newOrders;
    }

    @Override
    public Order getOrderByID(long id) {
        List<Order> orderList = getOrders();
        for (Order order : orderList) {
            if (order.getOrderID() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public void add(Order newOrder) {
//        List<OrderItem> orderItems = getOrderItem();
//        orderItems.add(OrderItem newOI);
        orders.add(newOrder);
        CSVUtils.write(path, orders);
    }



    @Override
    public void remove(Order order) {
        orders.remove(order);
        update();
    }

    @Override
    public void update() {
        List<Order> orderList = getOrders();
        CSVUtils.write(path, orders);
    }

    @Override
    public boolean exists(long id) {
        return getOrderByID(id) != null;
    }
}
