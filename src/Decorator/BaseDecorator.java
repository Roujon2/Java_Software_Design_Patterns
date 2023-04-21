package Decorator;

// Can be abstract too (to not implement doSomething but then you would have to somehow get the reference to the concreteComponent)
public abstract class BaseDecorator implements Component{
    private ConcreteComponent decoratedConcreteComponent;

    public BaseDecorator(ConcreteComponent concreteComponent){
        this.decoratedConcreteComponent = concreteComponent;
    }

    @Override
    public void doSomething() {
        decoratedConcreteComponent.doSomething();
    }
}
