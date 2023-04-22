package VisitorPattern;

public class ConcreteElementA implements AbstractElement{
    @Override
    public void acceptVisitor(AbstractVisitor visitor) {
        visitor.visitElementA(this);
    }
}
