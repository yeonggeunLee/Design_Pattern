package design_pattern.ch03.modeling03;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";

    }

    public double cost() {
        return .89;             // 개선1과 다른점은 자기 자신만 더함
    }
}
