package menu;

import model.Employee;
import model.Transporter;
import persistence.RepositoryTransporter;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuTransporter {

    RepositoryTransporter repositoryTransporter = new RepositoryTransporter();

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: List all transporters");
        System.out.println("2: Show transporters with order");
        System.out.println("3: Add new transporter");
        System.out.println("4: Remove transporter");
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
                    menuListAllTransporters(input);
                    break;
                case 2:
                    break;
                case 3:
                    menuAddNewTransporter(input);
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

    private void menuListAllTransporters(Scanner input) {
        List<Transporter> listTransporter = repositoryTransporter.listAllTransporters();

        if (listTransporter.size() > 0) {
            System.out.println("\nList of Employees:");
            for (Transporter transporter : listTransporter) {
                System.out.println(transporter.toString());
            }
        } else {
            System.out.println("\nNo employees registered\n");
            menuOptions(input);
        }
    }

    private void menuAddNewTransporter(Scanner input){

        repositoryTransporter.addTransporter();
    }
}
