package design_pattern.ch03.modeling03;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;                   // CondimentDecorator가 Beverage와 연관 관계이기 때문에 Beverage에 대한 내용을 알고 있다.
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";            // beverage.getDescription()를 통해 앞의 내용에 Milk를 더한다. 부모 클래스의 메소드를 가져와 사용
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();               // 부모 클래스의 메소드를 가져와 사용
    }
}
