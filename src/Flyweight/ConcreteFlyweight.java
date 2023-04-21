package Flyweight;

public class ConcreteFlyweight {
    private String aName;

    public ConcreteFlyweight(String pName){
        this.aName = pName;
    }

    public String getName() {
        return aName;
    }
}
