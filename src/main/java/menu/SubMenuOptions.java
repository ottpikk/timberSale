package menu;

import java.util.Scanner;

public class SubMenuOptions {
    boolean exit = false;
    private MenuCustomer menuCustomer;
    private MenuOrder menuOrder;
    private MenuEmployee menuEmployee;
    private MenuMaterial menuMaterial;
    private MenuSupplier menuSupplier;
    private MenuPayment menuPayment;
    private MenuTransporter menuTransporter;

    public SubMenuOptions() {
        this.menuCustomer = new MenuCustomer();
        this.menuEmployee = new MenuEmployee();
        this.menuTransporter = new MenuTransporter();
        this.menuMaterial = new MenuMaterial();
    }

    private int menuOptions(Scanner input) {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Main menu ");
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("1: Sub Menu - Order");
        System.out.println("2: Sub Menu - Delivery");
        System.out.println("3: Sub Menu - Payment");
        System.out.println("4: Sub Menu - Material");
        System.out.println("5: Sub Menu - Customer");
        System.out.println("6: Sub Menu - Supplier");
        System.out.println("7: Sub Menu - Transporter");
        System.out.println("8: Sub Menu - Employee");
        System.out.println("100 - Quit");
        System.out.println("***************************************************");

        System.out.println("Type the sub menu option: ");
        return input.nextInt();
    }

    public void menuChoice(Scanner input) {
        while(!exit) {
            int userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    this.menuOrder.menuChoice(input);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    this.menuMaterial.menuChoice(input);
                    break;
                case 5:
                    this.menuCustomer.menuChoice(input);
                    break;
                case 6:
                    break;
                case 7:
                    this.menuTransporter.menuChoice(input);
                    break;
                case 8:
                    this.menuEmployee.menuChoice(input);
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 100:
                    exit = true;
                    System.out.println("System closed");
                    break;
//                default:
//                    System.out.println("\nSorry, please enter valid Option");
//                    menuChoice(input);
            }
        }
    }
}
