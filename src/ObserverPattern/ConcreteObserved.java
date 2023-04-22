package ObserverPattern;

import java.util.ArrayList;

public class ConcreteObserved implements AbstractObserved{

    private int dataForObserver = 0;

    // To store the reference to the observers
    ArrayList<AbstractObserver> observers = new ArrayList<>();

    // Methods to add observers and remove and getData
    public int getDataForObserver(){
        return this.dataForObserver;
    }

    @Override
    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {
        observers.remove(observer);
    }


    // This would be a pull data flow example, providing the ConcreteObserved object where the ConcreteObserver
    // can pull the data through implemented getter methods
    @Override
    public void notifyObservers() {
        for (AbstractObserver observer: observers) {
            observer.update(this);
        }
    }

    // This would be a push data flow example, giving the ConcreteObserver exactly what it needs
    // In this case you would have to modify the AbstractObserver Interface arguments
    /*@Override
    public void notifyObservers() {
        for (AbstractObserver observer: observers) {
            observer.update(this.DataForObserver);
        }
    }*/
}
