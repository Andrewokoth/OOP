package com.vu.utms.core;

// The abstract Vehicle class serves as a general blueprint for all types of vehicles
// within the UTMS. It encapsulates common attributes and enforces subclasses to provide
// specific implementation of how vehicle information is displayed.
public abstract class Vehicle {

    // Private fields storing common vehicle details
    private String registrationNumber; // Unique registration number of the vehicle
    private int capacity; // Seating or carrying capacity
    private VehicleType type; // Enum representing type of vehicle (e.g., BUS, VAN)
    private String model; // Model name or number of the vehicle
    private int year; // Manufacture or registration year

    // Constructor initializes all core vehicle attributes
    public Vehicle(String registrationNumber, int capacity, VehicleType type, String model, int year) {
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
        this.type = type;
        this.model = model;
        this.year = year;
    }

    // Getter and setter methods for encapsulated fields to provide controlled
    // access

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract method that must be implemented by subclasses
    // Defines how each specific vehicle type displays its information
    public abstract void displayVehicleInfo();
}
