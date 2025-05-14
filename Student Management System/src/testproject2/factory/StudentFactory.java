package testproject2.factory;  // Defines the package name for the class

public class StudentFactory {  // Declares the StudentFactory class which is responsible for creating Student objects
    public static Student createStudent(String type, String id, String name) {  // Static method to create different types of students based on the 'type' parameter
        switch (type.toLowerCase()) {  // Switch statement to handle different student types (case insensitive)
            case "undergraduate":  // If type is "undergraduate", create and return an UndergraduateStudent
                return new UndergraduateStudent(id, name);
            case "graduate":  // If type is "graduate", create and return a GraduateStudent
                return new GraduateStudent(id, name);
            case "part-time":  // If type is "part-time", create and return a PartTimeStudent
                return new PartTimeStudent(id, name);
            default:  // If type does not match any known type, throw an exception
                throw new IllegalArgumentException("Unknown student type: " + type);
        }
    }
}
    