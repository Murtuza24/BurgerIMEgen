package com.company.dbHelpersDAO;

import com.company.model.Menu;
import com.company.model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseHelperMenu {

    // singleton class acting as a source of data for this project.
    private static DatabaseHelperMenu instance = null;

    public List<Menu> menuList;

    public Menu menu;
    public List<MenuItem> menuItems;

    private DatabaseHelperMenu() {
        this.menuList = new ArrayList<>();
        createMenu1();
    }

    // creating Menu and menu items
    private void createMenu1() {

        // menu items for Burger section
        this.menu = new Menu();
        this.menuItems = new ArrayList<>();
        menu.setRestaurantId_fk("IM001");
        menu.setMenuId("HB");
        menu.setMenuType("Burgers");

        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("HB001", "Grilled Chicken",
                "1/4 Lb. Chicken, Chipotle Aioli, Mixed Greens, Roma Tomato, Avocado, Swiss Cheese ",
                6.99));
        menuItems.add(new MenuItem("HB002", "Crispy Chicken",
                "1/4 Lb. Chicken, House Sauce, Caramelized Onions, Mixed Greens, Pickles, Buffalo Sauce ",
                7.99));
        menuItems.add(new MenuItem("HB003", "Angus Beef",
                "1/3 Lb. Patty, House Sauce, Leaf Lettuce, Roma Tomato, Pickles, Shaved Onions, American Cheese ",
                9.99));

        menuItems.add(new MenuItem("HB004", "Greek Lamb",
                "1/3 Lb. Patty, Tzaziki, Mixed Greens, Shaved Onions, Roma Tomato ",
                7.49));
        menu.setMenuItems(menuItems);
        menuList.add(menu);


        // menu items for Fries section
        this.menu = new Menu();
        this.menuItems = new ArrayList<>();
        menu.setRestaurantId_fk("IM002");
        menu.setMenuId("FS");
        menu.setMenuType("Fries");

        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("FS001", "Regular Fries",
                "Regular Potato Fries, Salt, Pepper",
                1.99));
        menuItems.add(new MenuItem("FS002", "Cheese Fries",
                "Regular Potato Fries with melted american cheese, Salt, Pepper",
                2.99));
        menuItems.add(new MenuItem("FS003", "Onion Rings",
                "Onion Rings fried in batters, Salt, Pepper",
                1.99));
        menu.setMenuItems(menuItems);
        menuList.add(menu);


    }

    public static DatabaseHelperMenu getInstance() {

        if (instance == null) {
            instance = new DatabaseHelperMenu();
        }

        return instance;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public Menu getMenu(String menuId) {

        List<Menu> menu = getMenuList().stream()
                .filter(p -> p.getMenuId().equals(menuId)).collect(Collectors.toList());


        return menu.get(0);
    }

}
