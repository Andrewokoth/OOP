package com.vu.utms.core;

// The Route class represents a specific transport route in the UTMS.
// It includes details such as the route ID, start and end points, stops along the route, and the total distance.
public class Route {

    // Private fields to encapsulate route information
    private String routeId; // Unique identifier for the route
    private String startPoint; // Starting location of the route
    private String endPoint; // Ending location of the route
    private String[] stops; // Intermediate stops on the route
    private double distance; // Total distance of the route in kilometers

    // Constructor to initialize all fields when creating a new Route object
    public Route(String routeId, String startPoint, String endPoint, String[] stops, double distance) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.stops = stops;
        this.distance = distance;
    }

    // Getter for route ID
    public String getRouteId() {
        return routeId;
    }

    // Setter for route ID
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    // Getter for start point
    public String getStartPoint() {
        return startPoint;
    }

    // Setter for start point
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    // Getter for end point
    public String getEndPoint() {
        return endPoint;
    }

    // Setter for end point
    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    // Getter for array of route stops
    public String[] getStops() {
        return stops;
    }

    // Setter for stops array
    public void setStops(String[] stops) {
        this.stops = stops;
    }

    // Getter for route distance
    public double getDistance() {
        return distance;
    }

    // Setter for route distance
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Method to display all route information
    public void displayRouteInfo() {
        System.out.println("Route ID: " + routeId);
        System.out.println("From: " + startPoint + " to " + endPoint);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Stops:");
        for (String stop : stops) {
            System.out.println("- " + stop);
        }
    }
}
