package com.vu.utms.core;

// The abstract User class serves as a base template for all types of users in the UTMS system.
// It encapsulates common user information and enforces subclasses to implement transport request behavior.
public abstract class User {

    // Private fields to store common user attributes securely
    private String id; // Unique identifier for the user
    private String name; // Full name of the user
    private String email; // Email address for contact and login
    private String password; // User password
    private UserType userType; // Enum indicating the role/type of the user (Student, Lecturer, etc.)

    // Constructor initializes all common user attributes
    public User(String id, String name, String email, String password, UserType userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    // Getter and Setter methods provide controlled access to private fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    // Abstract method that must be implemented by all subclasses
    // Defines how each specific user requests transport
    public abstract void requestTransport();

    // Concrete method that simulates user login action
    public void login() {
        System.out.println(name + " logged in as " + userType);
    }
}
