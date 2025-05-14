package testproject2.factory;  // Declares that this class is part of the "testproject2.factory" package

public class ElectiveCourse extends Course {  // Defines a public class named ElectiveCourse that extends the abstract Course class

    public ElectiveCourse(String code, String title) {  // Constructor that takes a course code and title
        super(code, title);  // Calls the superclass (Course) constructor to initialize code and title
    }

    @Override  // Indicates that this method overrides the abstract method in the parent class
    public String getCategory() {  // Implementation of the abstract method to return the course category
        return "Elective";  // Returns the category as "Elective"
    }
}
