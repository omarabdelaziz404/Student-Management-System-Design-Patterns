package testproject2.singleton; 
import java.util.ArrayList;     
import java.util.List;   

public class CourseRegistrationManager {  // Declares the class to manage course registrations using Singleton pattern

    private static CourseRegistrationManager instance;  // Static variable to hold the single instance of the class

    private List<String> registeredCourses;  // List to store the names of registered courses

    private CourseRegistrationManager() {  // Private constructor to prevent external instantiation
        registeredCourses = new ArrayList<>();  // Initializes the registeredCourses list
    }

    public static CourseRegistrationManager getInstance() {  // Public method to provide access to the single instance
        if (instance == null) {  // Checks if the instance hasn't been created yet
            instance = new CourseRegistrationManager();  // Creates the instance if it's null
        }
        return instance;  // Returns the single instance
    }

    public void registerCourse(String course) {  // Registers a new course by adding it to the list
        registeredCourses.add(course);  // Adds the course name to the registeredCourses list
        System.out.println("Registered course: " + course);  // Prints confirmation message
    }

    public List<String> getRegisteredCourses() {  // Returns the list of all registered courses
        return registeredCourses;  // Returns the registeredCourses list
    }
}
