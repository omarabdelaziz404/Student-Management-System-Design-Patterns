package testproject2.observer;  

public interface Observer {  // Defines the Observer interface used in the Observer Design Pattern

    void update(String message);  // Declares a method that must be implemented by all observers
                                  // It's used to notify the observer with a message
}
