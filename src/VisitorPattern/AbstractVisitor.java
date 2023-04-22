package VisitorPattern;

// With each new ConcreteElement added, a new method must be created
public interface AbstractVisitor {
    void visitElementA(ConcreteElementA elementA);
}
