/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject2.strategy;

/**
 *
 * @author Omar
 */
public class GradeContext {
    private GradingStrategy strategy;

    public GradeContext(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(int score) {
        return strategy.calculateGrade(score);
    }
}