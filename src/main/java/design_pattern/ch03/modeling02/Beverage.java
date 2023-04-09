package design_pattern.ch03.modeling02;

public abstract class Beverage {
    protected String description;
    private boolean milk = false;
    private boolean mocha = false;

    public String getDescription() {
        return description;
    }

    /**
     * Beverage 클래스의 cost()는 첨가물에 대한 가격만 계산된다.
     * 서브 클래스에서 cost() 메소드를 오버라이드 할 때는 그 기능을 확장하여 특정 음료 형식의 가격을 더함
     * @return 추가된 항목의 가격 (첨가물)
     */
    public double cost(){
        double cost = 0.0;

        if(hasMilk()){
            cost += 0.1;
        }
        if(hasMocha()){
            cost += 0.2;
        }
        return cost;
    }

    public boolean hasMilk(){
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasMocha(){
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
}
