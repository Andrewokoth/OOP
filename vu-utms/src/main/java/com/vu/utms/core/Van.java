package com.vu.utms.core;

// The Van class represents a van vehicle in the UTMS system.
// It extends the Vehicle base class and implements Serviceable and Trackable interfaces.
public class Van extends Vehicle implements Serviceable, Trackable {

    // Private fields specific to Van
    private String vanType;          // Type or model of the van (e.g., mini-van, cargo)
    private String currentLocation;  // Current location of the van
    private boolean needsService;    // Flag indicating whether the van needs maintenance

    // Constructor initializes Van object with details and passes common vehicle info to Vehicle superclass
    public Van(String registrationNumber, int capacity, String model, int year, String vanType) {
        super(registrationNumber, capacity, VehicleType.VAN, model, year);
        this.vanType = vanType;
    }

    // Getter for vanType
    public String getVanType() {
        return vanType;
    }

    // Setter for vanType
    public void setVanType(String vanType) {
        this.vanType = vanType;
    }

    // Implementation of performMaintenance from Serviceable interface
    // Simulates maintenance by printing a message and resetting needsService flag
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on van " + getRegistrationNumber());
        needsService = false;
    }

    // Implementation of isDueForService from Serviceable interface
    // Returns whether the van requires service
    @Override
    public boolean isDueForService() {
        return needsService;
    }

    // Implementation of updateLocation from Trackable interface
    // Updates and prints the current location of the van
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
        System.out.println("Van " + getRegistrationNumber() + " now at " + location);
    }

    // Implementation of getCurrentLocation from Trackable interface
    // Returns the van's current location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Overrides displayVehicleInfo from Vehicle superclass
    // Prints detailed information about the van
    @Override
    public void displayVehicleInfo() {
        System.out.println("Van Information:");
        System.out.println("Registration: " + getRegistrationNumber());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Type: " + vanType);
    }

    // Setter to manually update whether the van needs service
    public void setNeedsService(boolean needsService) {
        this.needsService = needsService;
    }
}
