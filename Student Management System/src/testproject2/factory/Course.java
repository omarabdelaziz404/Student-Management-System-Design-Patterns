package testproject2.factory;  // Declares that this class is part of the "testproject2.factory" package

public abstract class Course {  // Defines an abstract class named Course. Must be extended by subclasses.

    protected String code;  // Protected variable to store the course code (e.g., "CS101")
    protected String title;  // Protected variable to store the course title (e.g., "Introduction to Java")

    public Course(String code, String title) {  // Constructor to initialize course code and title
        this.code = code;  // Assigns the provided code to the instance variable
        this.title = title;  // Assigns the provided title to the instance variable
    }

    public abstract String getCategory();  // Abstract method to get course category (must be implemented by subclasses)

    public String getCode() {  // Getter method to return the course code
        return code;  // Returns the code value
    }

    public String getTitle() {  // Getter method to return the course title
        return title;  // Returns the title value
    }
}
