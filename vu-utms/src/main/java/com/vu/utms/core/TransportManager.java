package com.vu.utms.core;

// The TransportManager class handles operations related to managing drivers and transport requests in the UTMS.
public class TransportManager {

    // Overloaded method to assign a driver to a specific vehicle instance
    public void assignDriver(Driver driver, Vehicle vehicle) {
        System.out.println("Assigning driver " + driver.getName() + " to vehicle " + vehicle.getRegistrationNumber());
    }

    // Overloaded method to assign a driver based on vehicle type (e.g., BUS, VAN)
    public void assignDriver(Driver driver, VehicleType vehicleType) {
        System.out.println("Assigning driver " + driver.getName() + " to a " + vehicleType + " vehicle");
    }

    // Overloaded method to assign a driver to a specific shift time (e.g., MORNING, EVENING)
    public void assignDriver(Driver driver, ShiftTime shiftTime) {
        System.out.println("Assigning driver " + driver.getName() + " to " + shiftTime + " shift");
    }

    // Overloaded method to assign a driver to a vehicle type for a specific shift time
    public void assignDriver(Driver driver, VehicleType vehicleType, ShiftTime shiftTime) {
        System.out.println("Assigning driver " + driver.getName() + 
                " to a " + vehicleType + " vehicle for " + shiftTime + " shift");
    }

    // Method to manage transport requests coming from any User subclass (Student, Lecturer, TransportOfficer)
    // Demonstrates polymorphism by calling the overridden requestTransport() method of the specific user
    public void manageTransportRequest(User user) {
        user.requestTransport();  
    }
}
