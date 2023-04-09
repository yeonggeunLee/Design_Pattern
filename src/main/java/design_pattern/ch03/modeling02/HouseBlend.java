package design_pattern.ch03.modeling02;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    /**
     *
     * @return super.cost() 추가 . Beverage 클래스의 cost(). 첨가물에 대한 가격
     */
    public double cost() {
        return .89 + super.cost();
    }
}
