package testproject2.strategy;  // Defines the package name for the class

public class GpaStrategy implements GradingStrategy {  // Declares the class GpaStrategy that implements the GradingStrategy interface
    @Override  // Indicates that the method below overrides a method from the interface
    public String calculateGrade(int score) {  // Method that calculates the grade based on the score parameter
        if (score >= 90) return "A";  // If the score is 90 or above, return grade "A"
        else if (score >= 80) return "B";  // If the score is between 80 and 89, return grade "B"
        else if (score >= 70) return "C";  // If the score is between 70 and 79, return grade "C"
        else if (score >= 60) return "D";  // If the score is between 60 and 69, return grade "D"
        else return "F";  // If the score is below 60, return grade "F"
    }
}
