package design_pattern.ch03.modeling03;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Milk(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        Beverage b2 = new Mocha(new Mocha(new Milk(new HouseBlend())));             // 위와 같은 결과
        System.out.println(b2.getDescription() + " $" + b2.cost());
    }
}
