package Prototype;

public class Component {
    private final CompSource compSourcePrototype;
    private CompSource compSource;

    public Component(CompSource compSourcePrototype) {
        // Sets the prototype
        this.compSourcePrototype = compSourcePrototype;
        newCompSource();
    }

    public void newCompSource() {
        // Copies the prototype
        compSource = compSourcePrototype.copy();
    }
}
