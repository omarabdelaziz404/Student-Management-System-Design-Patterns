package testproject2.strategy;  // Defines the package name for the class

public class PassFailStrategy implements GradingStrategy {  // Declares the PassFailStrategy class that implements the GradingStrategy interface
    @Override  // Indicates that the method below overrides a method from the interface
    public String calculateGrade(int score) {  // Method that calculates the grade as "Pass" or "Fail" based on the score parameter
        return (score >= 50) ? "Pass" : "Fail";  // If the score is 50 or above, return "Pass", otherwise return "Fail"
    }
}
