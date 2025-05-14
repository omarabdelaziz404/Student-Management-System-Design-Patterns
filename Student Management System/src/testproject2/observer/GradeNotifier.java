package testproject2.observer;

import java.util.ArrayList;  // Imports ArrayList to store a list of observers
import java.util.List;       // Imports the List interface

public class GradeNotifier implements Observable {
    // GradeNotifier is the observable class that notifies all registered observers (students) when a grade is updated

    private List<Observer> observers = new ArrayList<>();
    // A list that holds all registered observers (students)

    @Override
    public void registerObserver(Observer observer) {
        // Adds a new observer to the list
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // Removes an observer from the list
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // Notifies all observers with the given message
        for (Observer observer : observers) {
            observer.update(message);  // Calls the update() method on each observer
        }
    }

    public void gradeUpdated(String studentName, int grade) {
        // Custom method that formats and sends a grade update message to all observers
        notifyObservers("Your grade has been updated to: " + grade + " (Student: " + studentName + ")");
    }
}
