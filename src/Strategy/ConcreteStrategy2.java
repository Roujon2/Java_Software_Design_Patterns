package Strategy;

public class ConcreteStrategy2 implements AbstractStrategy{
    private String name;

    @Override
    public void execute() {
        name += "a";
    }

    public ConcreteStrategy2(String name){
        this.name = name;
    }
}
