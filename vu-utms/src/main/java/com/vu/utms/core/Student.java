package com.vu.utms.core;

// The Student class extends the User class, representing a student user in the UTMS.
// It includes student-specific information such as student ID and course of study.
public class Student extends User {

    // Private fields unique to students
    private String studentId;  // Unique university student identifier
    private String course;     // The course or program the student is enrolled in

    // Constructor to initialize both base (User) and student-specific fields
    public Student(String id, String name, String email, String password, String studentId, String course) {
        // Calls the constructor of the parent class (User) and specifies the user type as STUDENT
        super(id, name, email, password, UserType.STUDENT);
        this.studentId = studentId;
        this.course = course;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Overridden method from the User class to reflect how students request transport
    // Demonstrates runtime polymorphism with specialized behavior
    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " requesting transport with student discount");
    }
}
