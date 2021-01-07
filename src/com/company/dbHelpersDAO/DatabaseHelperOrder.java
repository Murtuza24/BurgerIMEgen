package com.company.dbHelpersDAO;

import com.company.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DatabaseHelperOrder {

    // singleton class acting as a source of data for this orders.
    private static DatabaseHelperOrder instance = null;

    public List<Order> orderList;

    private DatabaseHelperOrder() {
        this.orderList = new ArrayList<>();

    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public Order getOrderById(Long id) {
        return orderList.stream().filter(o -> o.getOrderId().equals(id)).collect(Collectors.toList()).get(0);
    }


    public void placeOrder(Order order) {
        order.setOrderId(new Random().nextLong());
        order.setStatus("OrderPlaced");
        order.setCreatedTime(LocalDate.now());
        orderList.add(order);
    }

    public static DatabaseHelperOrder getInstance() {

        if (instance == null) {
            instance = new DatabaseHelperOrder();
        }

        return instance;
    }

}
