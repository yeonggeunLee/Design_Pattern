package design_pattern.ch03.modeling03;

public abstract class CondimentDecorator extends Beverage {     // 3라인의 Beverage는 상속관계
    protected Beverage beverage;        // 4라인의 Beverage는 연관관계

    @Override
    public abstract String getDescription();                // CondimentDecorator 에서의 getDescription()는 의미가 없으므로 abstract
}
