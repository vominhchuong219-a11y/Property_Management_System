package Property_Management_System;
import java.util.Scanner;
public abstract class Property implements IProperty {
    private String propertyId;
    private String address;
    private double area;
    private double pricePerSqm;

    public Property() {
    }

    public Property(String propertyId, String address, double area, double pricePerSqm) {
        this.propertyId = propertyId;
        this.address = address;
        this.area = area;
        this.pricePerSqm = pricePerSqm;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPricePerSqm() {
        return pricePerSqm;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPricePerSqm(double pricePerSqm) {
        this.pricePerSqm = pricePerSqm;
    }

    @Override
    public void addProperty(Scanner scanner) {
        System.out.print("Enter Property ID: ");
        setPropertyId(scanner.nextLine());

        System.out.print("Enter Address: ");
        setAddress(scanner.nextLine());

        System.out.print("Enter Area (sqm): ");
        setArea(Double.parseDouble(scanner.nextLine()));

        System.out.print("Enter Price per Sqm: ");
        setPricePerSqm(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public void updateProperty(Scanner scanner) {
        System.out.print("Enter New Address: ");
        setAddress(scanner.nextLine());

        System.out.print("Enter New Area (sqm): ");
        setArea(Double.parseDouble(scanner.nextLine()));

        System.out.print("Enter New Price per Sqm: ");
        setPricePerSqm(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public void displayInfo() {
        System.out.printf("ID: %s | Address: %s | Area: %.2f | Price/Sqm: %.2f | ",
                getPropertyId(), getAddress(), getArea(), getPricePerSqm());
    }

    public abstract double calculateTotalValue();
}
