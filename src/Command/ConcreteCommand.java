package Command;

public class ConcreteCommand implements AbstractCommand{
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }

    @Override
    public void undo() {
        receiver.doOpposite();
    }
}
