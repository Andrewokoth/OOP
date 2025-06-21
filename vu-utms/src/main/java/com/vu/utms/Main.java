package com.vu.utms;

import com.vu.utms.core.*;

public class Main {
    public static void main(String[] args) {
        // Create users
        Student student = new Student("VU-001", "TestUser", "testuser@vu.sc.ac.ug", "password", "VU123",
                "Computer Science");
        Lecturer lecturer = new Lecturer("VU-STA-001", "Eng. Bazigu", "balex@vu.sc.ac.ug", "password", "LEC456",
                "Engineering");
        TransportOfficer officer = new TransportOfficer("T001", "Officer Victoria", "brown@vu.edu", "password", "TO789",
                "Transport");

        // Create drivers
        Driver driver1 = new Driver("D001", "Mike Victorian", "DL123456", ShiftTime.MORNING);
        Driver driver2 = new Driver("D002", "Sarah Bukenya", "DL654321", ShiftTime.AFTERNOON);

        // Create vehicles
        Bus bus = new Bus("BUS001", 50, "Isuzu", 2020, "Route 101");
        Van van = new Van("VAN001", 12, "Toyota", 2021, "Passenger");

        // Set some service needs
        bus.setNeedsService(true);
        van.setNeedsService(false);

        // Create transport manager
        TransportManager manager = new TransportManager();

        System.out.println(" Demonstrating Polymorphism");
        manager.manageTransportRequest(student);
        manager.manageTransportRequest(lecturer);
        manager.manageTransportRequest(officer);

        System.out.println("\n Demonstrating Method Overloading ");
        manager.assignDriver(driver1, bus);
        manager.assignDriver(driver2, VehicleType.VAN);
        manager.assignDriver(driver1, ShiftTime.MORNING);
        manager.assignDriver(driver2, VehicleType.BUS, ShiftTime.AFTERNOON);

        System.out.println("\n Demonstrating Interface Implementation ");
        bus.updateLocation("Main Campus");
        bus.assignSchedule("8:00 AM - 5:00 PM");
        if (bus.isDueForService()) {
            bus.performMaintenance();
        }

        van.updateLocation("Market Plaza");
        System.out.println("Van location: " + van.getCurrentLocation());

        System.out.println("\n Demonstrating Inheritance ");
        student.login();
        lecturer.login();
        officer.login();

        System.out.println("\n Displaying Vehicle Information ");
        bus.displayVehicleInfo();
        System.out.println();
        van.displayVehicleInfo();

        // Create and display route
        Route route = new Route("R001", "Main Campus", "Market Plaza",
                new String[] { "Nkrumah Road", "Nasser Business Center", "Parkyard" }, 15.5);
        System.out.println("\n Route Information =>");
        route.displayRouteInfo();
    }
}