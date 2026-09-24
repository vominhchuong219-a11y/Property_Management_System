package Property_Management_System;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PropertyList list = new PropertyList();
        int choice;

        do {
            System.out.println("\n--- PROPERTY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add House");
            System.out.println("2. Add Land");
            System.out.println("3. Update Property");
            System.out.println("4. Delete Property");
            System.out.println("5. Find Property");
            System.out.println("6. Display All Properties");
            System.out.println("7. Display Properties > 1 Billion");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    House house = new House();
                    house.addProperty(scanner);
                    list.addProperty(house);
                    break;
                case 2:
                    Land land = new Land();
                    land.addProperty(scanner);
                    list.addProperty(land);
                    break;
                case 3:
                    System.out.print("Enter Property ID to update: ");
                    list.updateProperty(scanner.nextLine(), scanner);
                    break;
                case 4:
                    System.out.print("Enter Property ID to delete: ");
                    list.deletePropertyById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter Property ID to find: ");
                    Property p = list.findPropertyById(scanner.nextLine());
                    if (p != null) {
                        p.displayInfo();
                    } else {
                        System.out.println("Property not found.");
                    }
                    break;
                case 6:
                    list.displayAllProperties();
                    break;
                case 7:
                    list.displayPropertiesOver1Billion();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
