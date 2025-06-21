package com.vu.utms.core;

// The Driver class represents a transport driver in the UTMS.
// It includes personal details and shift assignment.
public class Driver {

    // Private fields to store driver information
    private String driverId;         // Unique ID assigned to the driver
    private String name;            // Driver's full name
    private String licenseNumber;   // Driver's license number
    private ShiftTime shiftTime;    // Enum or class representing the driver's working shift (e.g., morning, evening)

    // Constructor to initialize all attributes when creating a new Driver object
    public Driver(String driverId, String name, String licenseNumber, ShiftTime shiftTime) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.shiftTime = shiftTime;
    }

    // Getter method for driverId
    public String getDriverId() {
        return driverId;
    }

    // Setter method for driverId
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    // Getter method for driver's name
    public String getName() {
        return name;
    }

    // Setter method for driver's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for driver's license number
    public String getLicenseNumber() {
        return licenseNumber;
    }

    // Setter method for license number
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Getter method for driver's shift time
    public ShiftTime getShiftTime() {
        return shiftTime;
    }

    // Setter method for shift time
    public void setShiftTime(ShiftTime shiftTime) {
        this.shiftTime = shiftTime;
    }

    // Overridden toString() method to return a simple description of the driver
    @Override
    public String toString() {
        return "Driver{" + 
               "driverId=" + driverId + 
               ", name=" + name + 
               ", shiftTime=" + shiftTime + 
               '}';
    }
}
