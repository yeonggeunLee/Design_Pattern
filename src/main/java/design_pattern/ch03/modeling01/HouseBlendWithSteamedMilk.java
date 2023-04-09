package design_pattern.ch03.modeling01;

public class HouseBlendWithSteamedMilk extends Beverage{
    public HouseBlendWithSteamedMilk() {
        description = "House Blend Coffee With Steamed Milk";
    }

    /*
        우유 추가한 하우스 블렌드 커피 가격
        새로운 첨가물이 있을 때마다 새로운 클래스를 만들어야 한다.
        @return 우유값 0.1 추가
    */

    @Override
    public double cost() {
        return .89 + .1;
    }
}
