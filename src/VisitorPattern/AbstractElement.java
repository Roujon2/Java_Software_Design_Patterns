package VisitorPattern;

// Can add an abstract class for each ConcreteElement to implement
public interface AbstractElement {
    void acceptVisitor(AbstractVisitor visitor);
}
