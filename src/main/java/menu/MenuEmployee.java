package menu;


import model.Employee;
import persistence.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;

public class MenuEmployee {

    RepositoryEmployee repositoryEmployee = new RepositoryEmployee();

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: List all employees");
        System.out.println("2: Show orders for a employee");
        System.out.println("3: Add new employee");
        System.out.println("4: Remove employee");
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
                    menuListAllEmployees(input);
                    break;
                case 2:
                    break;
                case 3:
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



    private void menuListAllEmployees(Scanner input) {
        List<Employee> listEmployee = repositoryEmployee.listAllEmployees();

        if (listEmployee.size() > 0) {
            System.out.println("\nList of Employees:");
            for (Employee employee : listEmployee) {
                System.out.println(employee.toString());
            }
        } else {
            System.out.println("\nNo employees registered\n");
            menuOptions(input);
        }
    }
}
