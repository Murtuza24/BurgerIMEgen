package com.company;

import com.company.controller.MenuController;
import com.company.controller.OrderController;
import com.company.model.Order;
import com.company.model.OrderItem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome To Burger IM !!");
        Scanner scanner = new Scanner(System.in);

        try {
            boolean exit = false;
            while (!exit) {
                System.out.println("Select Options:");
                System.out.println("1 - Menu, 2 - Create Order, 3- Orders");

                int option = 0;
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                }

//                System.out.println("main menu" + option);
                switch (option) {
                    case 1:
                        System.out.println("Opening Menu");
                        MenuController menuController = new MenuController();
                        menuController.getMenu();

                        boolean exitMenu = false;
                        while (!exitMenu) {
                            System.out.println("Select MenuType Option");
                            System.out.println("1- Ham Burger, 2-Fries, 0- Go To Main Menu");

                            Scanner mOpScanner = new Scanner(System.in);
                            int menuOption = mOpScanner.nextInt();

                            switch (menuOption) {
                                case 1:
                                    menuController.getMenuItems("HB");

                                    System.out.println("Enter item to be ordered");


                                    break;
                                case 2:
                                    menuController.getMenuItems("FS");
                                    break;
                                default:
                                    mOpScanner.close();
                                    exitMenu = true;
                                    break;
                            }
                        }

                        break;
                    case 2:
                        System.out.println("Creating Order");
                        OrderController orderController = new OrderController();
                        Order order = new Order();
                        order.setCustomerId(1L);

                        List<OrderItem> orderItems = new ArrayList<>();
                        orderItems.add(new OrderItem("HB001", "Grilled Chicken", 6.99, 1));
                        orderItems.add(new OrderItem("HB003", "Angus Beef", 9.99, 1));
                        order.setOrderItemList(orderItems);

                        double totalPrice = calculateTotalPrice(orderItems);
                        order.setTotalPrice(totalPrice);
                        order.setStatus("OrderPlaced");
                        orderController.placeOrder(order);

                        break;
                    case 3:
                        System.out.println("Checking orders");
                        OrderController orderController1 = new OrderController();
                        orderController1.getAllOrders();

                        break;
                    default:
                        exit = true;
                        System.out.println("back to default main menu");
                        scanner.close();
                        break;
                }


            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static double calculateTotalPrice(List<OrderItem> orderItems) {
        return orderItems.stream().mapToDouble(item -> item.getItemPrice() * item.getQuantity()).sum();

    }
}
