package menu;

import model.Order;
import persistence.RepositoryOrder;

import java.util.List;
import java.util.Scanner;

public class MenuOrder {


    RepositoryOrder repositoryOrder = new RepositoryOrder();

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: Add new order");
        System.out.println("2: Delete a order");
        System.out.println("3: List all orders");
        System.out.println("4: Search order by customer");
        System.out.println("5: Search order by transporter");
        System.out.println("100 - Return to Main Menu");
        System.out.println("\n/***************************************************/");
        return input.nextInt();
    }

    protected void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    menuListAllOrders(input);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 100:
                    MainMenu.getMainMenu();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
    }



    private void menuListAllOrders(Scanner input) {
        List<Order> listOrder = repositoryOrder.listAllOrders();

        if (listOrder.size() > 0) {
            System.out.println("\nList of Orders:");
            for (Order order : listOrder) {
                System.out.println(order.toString());
            }
        } else {
            System.out.println("\nNo Orders registered\n");
            menuOptions(input);
        }
    }
}
