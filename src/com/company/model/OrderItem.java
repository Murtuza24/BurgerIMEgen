package com.company.model;

public class OrderItem {

    private String orderItemId;
    private String orderItemName;
    private Double itemPrice;
    private int quantity;

    public OrderItem(String orderItemId, String orderItemName, Double itemPrice, int quantity) {
        this.orderItemId = orderItemId;
        this.orderItemName = orderItemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
