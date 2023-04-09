package design_pattern.ch03.modeling01;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0;
    }
}
