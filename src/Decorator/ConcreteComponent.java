package Decorator;

public class ConcreteComponent implements Component{

    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent doing something");
    }

}
