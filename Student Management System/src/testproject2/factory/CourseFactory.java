package testproject2.factory; 

public class CourseFactory {  // Declares a public class named CourseFactory

    public static Course createCourse(String category, String code, String title) {  // Static method to create and return a Course object based on category
        switch (category.toLowerCase()) {  // Converts the input category to lowercase for case-insensitive comparison
            case "core":  // If the category is "core"
                return new CoreCourse(code, title);  // Return a new instance of CoreCourse
            case "elective":  // If the category is "elective"
                return new ElectiveCourse(code, title);  // Return a new instance of ElectiveCourse
            case "lab":  // If the category is "lab"
                return new LabCourse(code, title);  // Return a new instance of LabCourse
            default:  // If the category doesn't match any known type
                throw new IllegalArgumentException("Unknown course category: " + category);  // Throw an exception for invalid category
        }
    }
}
