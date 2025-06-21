package com.vu.utms.core;

// The Bus class represents a bus in the university transport system.
// It extends the Vehicle class and implements three interfaces: Serviceable, Trackable, and Schedulable.
public class Bus extends Vehicle implements Serviceable, Trackable, Schedulable {

    // Private fields specific to the Bus class
    private String routeNumber;        // Identifies the route assigned to this bus
    private String currentLocation;    // Stores the current location of the bus
    private String currentSchedule;    // Stores the current schedule assigned to the bus
    private boolean needsService;      // Indicates if the bus requires maintenance

    // Constructor initializes a Bus object using parameters and passes common vehicle info to the superclass (Vehicle)
    public Bus(String registrationNumber, int capacity, String model, int year, String routeNumber) {
        super(registrationNumber, capacity, VehicleType.BUS, model, year);
        this.routeNumber = routeNumber;
    }

    // Getter for routeNumber
    public String getRouteNumber() {
        return routeNumber;
    }

    // Setter for routeNumber
    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    // Implementation of performMaintenance from the Serviceable interface
    // Simulates performing maintenance on the bus and sets needsService to false
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on bus " + getRegistrationNumber());
        needsService = false;
    }

    // Implementation of isDueForService from the Serviceable interface
    // Returns whether the bus is due for service
    @Override
    public boolean isDueForService() {
        return needsService;
    }

    // Implementation of updateLocation from the Trackable interface
    // Updates and prints the current location of the bus
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
        System.out.println("Bus " + getRegistrationNumber() + " now at " + location);
    }

    // Implementation of getCurrentLocation from the Trackable interface
    // Returns the current location of the bus
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementation of assignSchedule from the Schedulable interface
    // Assigns and prints a new schedule to the bus
    @Override
    public void assignSchedule(String schedule) {
        this.currentSchedule = schedule;
        System.out.println("Bus " + getRegistrationNumber() + " assigned schedule: " + schedule);
    }

    // Implementation of getCurrentSchedule from the Schedulable interface
    // Returns the current schedule of the bus
    @Override
    public String getCurrentSchedule() {
        return currentSchedule;
    }

    // Overrides the displayVehicleInfo method from the Vehicle superclass
    // Prints detailed information about the bus
    @Override
    public void displayVehicleInfo() {
        System.out.println("Bus Information:");
        System.out.println("Registration: " + getRegistrationNumber());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Route: " + routeNumber);
    }

    // Setter method to manually update the needsService status of the bus
    public void setNeedsService(boolean needsService) {
        this.needsService = needsService;
    }
}
