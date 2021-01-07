package com.company.controller;

import com.company.dbHelpersDAO.DatabaseHelperMenu;
import com.company.model.Menu;

import java.util.List;

public class MenuController {

    public void getMenu() {
        List<Menu> menuList = DatabaseHelperMenu.getInstance().getMenuList();

        menuList.forEach(m ->
                System.out.println(m.getMenuId() + " -- " + m.getMenuType()));

    }

    public void getMenuItems(String menuId) {
        Menu menu = DatabaseHelperMenu.getInstance().getMenu(menuId);

        menu.getMenuItems().forEach(m ->
                System.out.println(m.getItemName() + " -- " + m.getItemPrice() + " -- " + m.getItemDescription()));


    }


}
