package Property_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class PropertyList {

    private ArrayList<Property> propertyList = new ArrayList<>();

    public void addProperty(Property property) {
        propertyList.add(property);
        System.out.println("Property added successfully!");
    }

    public void updateProperty(String id, Scanner scanner) {
        Property property = findPropertyById(id);
        if (property != null) {
            property.updateProperty(scanner);
            System.out.println("Property updated successfully!");
        } else {
            System.out.println("Property not found.");
        }
    }

    public void deletePropertyById(String id) {
        Property property = findPropertyById(id);
        if (property != null) {
            propertyList.remove(property);
            System.out.println("Property deleted successfully!");
        } else {
            System.out.println("Property not found.");
        }
    }

    public Property findPropertyById(String id) {
        for (Property p : propertyList) {
            if (p.getPropertyId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void displayAllProperties() {
        if (propertyList.isEmpty()) {
            System.out.println("No properties found.");
            return;
        }
        propertyList.forEach(Property::displayInfo);
    }

    public void displayPropertiesOver1Billion() {
        boolean found = false;
        for (Property p : propertyList) {
            if (p.calculateTotalValue() > 1000000000) {
                p.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No properties over 1 billion found.");
        }
    }
}
