package ObserverPattern;

public class ConcreteObserver implements AbstractObserver{

    int data;

    @Override
    public void update(AbstractObserved observed) {
        this.data = ((ConcreteObserved) observed).getDataForObserver();
    }
}
