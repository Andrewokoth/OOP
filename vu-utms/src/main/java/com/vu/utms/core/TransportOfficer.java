package com.vu.utms.core;

// The TransportOfficer class extends the User class to represent transport officers in the UTMS.
// It includes attributes specific to transport officers such as officer ID and department.
public class TransportOfficer extends User {

    // Private fields unique to transport officers
    private String officerId;   // Unique identifier for the transport officer
    private String department;  // Department to which the transport officer belongs

    // Constructor initializing both the base User class and TransportOfficer-specific fields
    public TransportOfficer(String id, String name, String email, String password, String officerId, String department) {
        // Calls User constructor with user type TRANSPORT_OFFICER
        super(id, name, email, password, UserType.TRANSPORT_OFFICER);
        this.officerId = officerId;
        this.department = department;
    }

    // Getter for officerId
    public String getOfficerId() {
        return officerId;
    }

    // Setter for officerId
    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Overridden requestTransport method demonstrating polymorphism
    // Defines specific behavior for transport officers when requesting transport
    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " requesting administrative transport");
    }
}
