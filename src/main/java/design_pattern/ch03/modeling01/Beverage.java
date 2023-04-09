package design_pattern.ch03.modeling01;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
