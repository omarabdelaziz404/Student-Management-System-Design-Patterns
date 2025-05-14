package testproject2.factory;  // Declares that this class is part of the "testproject2.factory" package

public class CoreCourse extends Course {  // Defines a public class named CoreCourse that extends the abstract Course class

    public CoreCourse(String code, String title) {  // Constructor that takes a course code and title
        super(code, title);  // Calls the superclass (Course) constructor to initialize code and title
    }

    @Override  // Indicates this method overrides the abstract method in the parent class
    public String getCategory() {  // Implementation of the abstract method to return the course category
        return "Core";  // Returns the category as "Core"
    }
}
