package design_pattern.ch03.modeling02;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }


    /**
     *
     * @return super.cost() 추가
     */
    public double cost() {
        return 1.99 + super.cost();
    }
}
