package design_pattern.ch03.modeling03;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {                // 다른 상속받을 것들은 getDescription()을 사용할거기 떄문에 abstract가 아님
        return description;
    }

    public abstract double cost();
}
