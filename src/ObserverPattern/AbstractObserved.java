package ObserverPattern;

public interface AbstractObserved {
    void addObserver(AbstractObserver observer);
    void removeObserver(AbstractObserver observer);
    void notifyObservers();
}
