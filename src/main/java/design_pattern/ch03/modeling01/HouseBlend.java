package design_pattern.ch03.modeling01;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
