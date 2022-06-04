package menu;

import model.Material;
import persistence.RepositoryMaterial;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuMaterial {

    Scanner scanner = new Scanner(System.in);
    RepositoryMaterial repositoryMaterial = new RepositoryMaterial();

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: List all materials in stock");
        System.out.println("2: List all materials");
        System.out.println("3: Add new material");
        System.out.println("4: Change materials price");
        System.out.println("5: Remove material");
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
                    menuListAllMaterials(input);
                    break;
                case 3:
                    menuAddMaterial();
                    break;
                case 4:
                    menuChangeMaterialPrice();
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

    private void menuListAllMaterials(Scanner input) {
        List<Material> listMaterial = repositoryMaterial.listAllMaterials();

        if (listMaterial.size() > 0) {
            System.out.println("\nList of all materials:");
            for (Material material : listMaterial) {
                System.out.println(material.toString());
            }
        } else {
            System.out.println("\nNo materials registered\n");
            menuOptions(input);
        }
    }

    private void menuAddMaterial(){
        Material material = new Material();
        System.out.println("Type of material: ");
        material.setType(scanner.nextLine());
        System.out.println("Length: ");
        material.setLength(scanner.nextInt());
        System.out.println("Width: ");
        material.setWidth(scanner.nextInt());
        System.out.println("Thickness: ");
        material.setThickness(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Measuring unit: ");
        material.setUnit(scanner.nextLine());
        System.out.println("Price per unit: ");
        material.setPrice(scanner.nextDouble());
        material.setDateOfRegister(LocalDate.now());
        repositoryMaterial.addMaterial(material);
    }

    private void menuChangeMaterialPrice(){
        System.out.println("Material id to change price: ");
        int id = scanner.nextInt();
        System.out.println("New price: ");
        double newPrice = scanner.nextDouble();
        repositoryMaterial.updatePriceById(id,newPrice);
    }
}
