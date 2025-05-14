package testproject2.observer;  

public class StudentObserver implements Observer {  // This class implements the Observer interface

    private String name;  // Stores the name of the student

    public StudentObserver(String name) {  // Constructor that sets the student's name
        this.name = name;
    }

    @Override  // Implements the update method from the Observer interface
    public void update(String message) {  // This method is called when a notification is sent from the Observable
        System.out.println("Notification for " + name + ": " + message);  // Prints the notification message for this student
    }

    public String getName() {  // Getter method to return the student's name
        return name;
    }
}
