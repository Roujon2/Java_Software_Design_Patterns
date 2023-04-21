package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> composite = new ArrayList<>();


    // Executes the method for each object in the composite
    @Override
    public void execute() {
        for (Component comp : composite) {
            comp.execute();
        }
    }

    // Adder and getter methods

}
