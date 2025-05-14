package testproject2.factory;  // Declares that this class belongs to the "testproject2.factory" package

public class LabCourse extends Course {  // Defines the LabCourse class which extends the abstract Course class

    public LabCourse(String code, String title) {  // Constructor that accepts a course code and title
        super(code, title);  // Calls the superclass (Course) constructor to initialize code and title
    }

    @Override  // Indicates this method overrides the abstract method from the Course class
    public String getCategory() {  // Implementation of getCategory to return the course category
        return "Lab";  // Returns "Lab" to specify this is a lab course
    }
}
