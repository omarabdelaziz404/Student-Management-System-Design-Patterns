package testproject2.observer; 

public interface Observable {  // Defines the Observable interface used in the Observer Design Pattern

    void registerObserver(Observer observer);  // Adds an observer to the list so it can receive updates

    void removeObserver(Observer observer);  // Removes an observer from the list so it no longer receives updates

    void notifyObservers(String message);  // Notifies all registered observers by sending them a message
}
