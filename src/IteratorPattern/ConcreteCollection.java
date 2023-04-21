package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteCollection implements Iterable<String>{
    // Data structure to iterate over
    private List<String> stringList = new ArrayList<>();


    // Here would be the constructor and other implementation (adding to list etc)


    // Override the iterator method and returns the List's iterator instead of creating a custom one
    @Override
    public Iterator<String> iterator() {
        // return new ConcreteIterator(this); using a custom iterator
        return stringList.iterator();
    }


    // Example of a custom iterable as an inner class (Could be a seperate class and pass the ConcreteCollection object like here)
    public class ConcreteIterator implements Iterator{

        ConcreteCollection concreteCollection;

        public ConcreteIterator(ConcreteCollection concColl){
            concreteCollection = concColl;
        }

        @Override
        public boolean hasNext() {
            return concreteCollection.iterator().hasNext();
        }

        @Override
        public Object next() {
            return concreteCollection.iterator().next();
        }
    }
}
