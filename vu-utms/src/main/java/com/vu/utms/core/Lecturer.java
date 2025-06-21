package com.vu.utms.core;

// The Lecturer class extends the User class, representing a lecturer user in the UTMS system.
// It includes additional details specific to lecturers such as staff ID and department.
public class Lecturer extends User {

    // Private fields unique to lecturers
    private String staffId;       // University-assigned staff identification number
    private String department;    // Department to which the lecturer belongs

    // Constructor initializes both base (User) and derived (Lecturer) class attributes
    public Lecturer(String id, String name, String email, String password, String staffId, String department) {
        // Call to the superclass constructor (User) with common user attributes
        super(id, name, email, password, UserType.LECTURER);
        this.staffId = staffId;
        this.department = department;
    }

    // Getter for staffId
    public String getStaffId() {
        return staffId;
    }

    // Setter for staffId
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Overridden method from the User class to reflect how lecturers request transport
    // Demonstrates polymorphism — different behavior for different user types
    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requesting priority transport");
    }
}
