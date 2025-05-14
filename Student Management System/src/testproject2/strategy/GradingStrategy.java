package testproject2.strategy;  // Defines the package name for the interface

public interface GradingStrategy {  // Declares the GradingStrategy interface
    String calculateGrade(int score);  // Abstract method that must be implemented by any class implementing this interface, which calculates the grade based on the score
}
