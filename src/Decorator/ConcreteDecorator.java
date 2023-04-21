package Decorator;

public class ConcreteDecorator extends BaseDecorator{

    public ConcreteDecorator(ConcreteComponent decoratedConcreteComponent) {
        super(decoratedConcreteComponent);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("Decorated");
    }
}
