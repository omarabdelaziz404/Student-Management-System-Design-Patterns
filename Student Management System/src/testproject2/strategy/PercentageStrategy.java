package testproject2.strategy;  // Defines the package name for the class

public class PercentageStrategy implements GradingStrategy {  // Declares the PercentageStrategy class that implements the GradingStrategy interface
    @Override  // Indicates that the method below overrides a method from the interface
    public String calculateGrade(int score) {  // Method that returns the score as a percentage string
        return score + "%";  // Returns the score followed by the percentage symbol "%"
    }
}
