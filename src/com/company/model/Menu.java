package com.company.model;

import java.util.List;

public class Menu {

    private String restaurantId_fk;
    private String menuId;
    private String menuType;

    private List<MenuItem> menuItems;

    public Menu() {
    }

    public Menu(String restaurantId_fk, String menuType, List<MenuItem> menuItems) {
        this.restaurantId_fk = restaurantId_fk;
        this.menuType = menuType;
        this.menuItems = menuItems;
    }

    public String getRestaurantId_fk() {
        return restaurantId_fk;
    }

    public void setRestaurantId_fk(String restaurantId_fk) {
        this.restaurantId_fk = restaurantId_fk;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
