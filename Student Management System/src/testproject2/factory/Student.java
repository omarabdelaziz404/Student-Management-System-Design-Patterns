package testproject2.factory;  // Defines the package name for the class

public abstract class Student {  // Declares the abstract class Student, which will be extended by specific student types
    protected String id;  // Protected field to store the student's ID
    protected String name;  // Protected field to store the student's name

    public Student(String id, String name) {  // Constructor to initialize id and name for a student
        this.id = id;
        this.name = name;
    }

    public abstract String getType();  // Abstract method to be implemented by subclasses to return the student's type (e.g., "undergraduate", "graduate")

    public String getId() {  // Method to get the student's ID
        return id;
    }

    public String getName() {  // Method to get the student's name
        return name;
    }
}
