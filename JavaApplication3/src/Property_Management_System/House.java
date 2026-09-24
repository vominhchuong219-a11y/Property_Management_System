package Property_Management_System;

import java.util.Scanner;

public class House extends Property {
    private int numberOfFloors;
    private int buildYear;

    public House() {
    }

    public House(int numberOfFloors, int buildYear) {
        this.numberOfFloors = numberOfFloors;
        this.buildYear = buildYear;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public void addProperty(Scanner scanner) {
        super.addProperty(scanner);

        System.out.print("Enter Number of Floors: ");
        setNumberOfFloors(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter Build Year: ");
        setBuildYear(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public void updateProperty(Scanner scanner) {
        super.updateProperty(scanner);

        System.out.print("Enter New Number of Floors: ");
        setNumberOfFloors(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter New Build Year: ");
        setBuildYear(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Floors: %d | Build Year: %d | Total Value: %.2f\n",
                getNumberOfFloors(), getBuildYear(), calculateTotalValue());
    }

    @Override
    public double calculateTotalValue() {
        return getArea() * getPricePerSqm() * getNumberOfFloors();
    }
}
