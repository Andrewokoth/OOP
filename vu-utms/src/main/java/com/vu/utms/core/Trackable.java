package com.vu.utms.core;

// The Trackable interface defines tracking-related behavior for vehicles or objects that can be located.
// Any class implementing this interface must provide logic for updating and retrieving its current location.
public interface Trackable {

    // Method to update the current location of the implementing object
    void updateLocation(String location);

    // Method to retrieve the current location of the implementing object
    String getCurrentLocation();
}
