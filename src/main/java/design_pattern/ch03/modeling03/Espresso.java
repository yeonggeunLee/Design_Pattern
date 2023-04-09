package design_pattern.ch03.modeling03;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;            // 첨가물이 생겨도 코드 변경할 필요가 없다.
    }
}
