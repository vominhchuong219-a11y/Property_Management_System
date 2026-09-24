package Property_Management_System;

import java.util.Scanner;

public class Land extends Property {
    private String landType;

    public Land() {
    }

    public Land(String landType) {
        this.landType = landType;
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }

    @Override
    public void addProperty(Scanner scanner) {
        super.addProperty(scanner);
        System.out.print("Enter Land Type (Residential/Agricultural): ");
        setLandType(scanner.nextLine());
    }

    @Override
    public void updateProperty(Scanner scanner) {
        super.updateProperty(scanner);
        System.out.print("Enter New Land Type: ");
        setLandType(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Land Type: %s | Total Value: %.2f\n",
                getLandType(), calculateTotalValue());
    }

    @Override
    public double calculateTotalValue() {
        double baseValue = getArea() * getPricePerSqm();
        if (getLandType().equalsIgnoreCase("Residential")) {
            return baseValue + (baseValue * 0.10);
        }
        return baseValue;
    }
}
