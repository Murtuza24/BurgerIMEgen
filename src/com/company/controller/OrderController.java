package com.company.controller;

import com.company.dbHelpersDAO.DatabaseHelperOrder;
import com.company.model.Order;

import java.util.Arrays;
import java.util.List;

public class OrderController {

    // fuction to list all orders
    public void getAllOrders() {
        List<Order> orders = DatabaseHelperOrder.getInstance().getOrderList();

        orders.forEach(order -> System.out.println("Order Id: " + order.getOrderId() + " - Created On: " + order.getCreatedTime()
                + " Total Price: " + order.getTotalPrice() + " OrderItems: " + Arrays.toString(new List[]{order.getOrderItemList()})));
    }

    // function to get order by id
    public void getOrderById(Long orderId) {
        Order order = DatabaseHelperOrder.getInstance().getOrderById(orderId);

        System.out.println("order id: " + order.getOrderId());
        System.out.println("created on: " + order.getCreatedTime());
        System.out.println("status: " + order.getStatus());
        System.out.println("Total: " + order.getTotalPrice());

        order.getOrderItemList().forEach(orderItem -> System.out.println(orderItem.getOrderItemName() + " - " + orderItem.getItemPrice()));

    }

    // place order
    public void placeOrder(Order order) {
        DatabaseHelperOrder.getInstance().placeOrder(order);
    }

}
