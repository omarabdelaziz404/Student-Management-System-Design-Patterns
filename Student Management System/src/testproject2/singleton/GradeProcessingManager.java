package testproject2.singleton;
import java.util.HashMap;
import java.util.Map;

// This class uses the Singleton pattern to manage student grades
public class GradeProcessingManager {

    private static GradeProcessingManager instance;  // Static variable to hold the single instance of this class

    private Map<String, Integer> studentGrades;  // A map to store student IDs and their corresponding grades

    private GradeProcessingManager() {  // Private constructor to prevent external instantiation
        studentGrades = new HashMap<>();  // Initializes the map to hold student grades
    }

    public static GradeProcessingManager getInstance() {  // Public method to provide global access to the single instance
        if (instance == null) {  // Checks if an instance already exists
            instance = new GradeProcessingManager();  // Creates the instance if it doesn't exist (lazy initialization)
        }
        return instance;  // Returns the existing or newly created instance
    }

    public void assignGrade(String studentId, int grade) {  // Adds or updates the grade for a given student
        studentGrades.put(studentId, grade);  // Adds the student ID and grade to the map
        System.out.println("Grade assigned to " + studentId + ": " + grade);  // Prints a confirmation message
    }

    public Integer getGrade(String studentId) {  // Returns the grade for a specific student ID
        return studentGrades.get(studentId);  // Looks up and returns the grade from the map
    }

    public Map<String, Integer> getAllGrades() {  // Returns the entire map of student grades
        return studentGrades;  // Returns the map of student grades
    }
}
