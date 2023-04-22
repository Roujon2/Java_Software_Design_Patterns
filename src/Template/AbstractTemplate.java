package Template;

// Defines skeleton of algorithm
public abstract class AbstractTemplate {
    // Final so that subclasses cannot override it
    public final void doSomething(){
        step1();
        step2();
        step3();
    }

    public void step1(){
        // Do something
    }
    public void step3(){
        // Do something
    }

    public abstract void step2();
}
