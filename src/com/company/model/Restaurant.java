package com.company.model;

public class Restaurant {

    private String restaurantName;
    private Long restaurantId;

    private String openTime;
    private String closeTime;

    private Address address;

    public Restaurant(String restaurantName, Long restaurantId, String openTime, String closeTime, Address address) {
        this.restaurantName = restaurantName;
        this.restaurantId = restaurantId;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.address = address;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
