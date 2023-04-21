package Strategy;


public class ConcreteStrategy1 implements AbstractStrategy{

    private int num;

    @Override
    public void execute() {
        num++;
    }

    public ConcreteStrategy1(int num){
        this.num = num;
    }
}
