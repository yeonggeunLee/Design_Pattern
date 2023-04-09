package design_pattern.ch03.modeling01;

// ch03 Decorate Pattern Basic Model
public class SomeCaffe {
    public static void main(String[] args) {
        HouseBlend hb = new HouseBlend();
        Espresso esp = new Espresso();

        System.out.println("HouseBlend 커피는 얼마인가요?");
        System.out.println(String.format("HouseBlend는 %.2f입니다.",hb.cost()));

        System.out.println("Espresso 커피는 얼마인가요?");
        System.out.printf("Espresso %.2f입니다.%n",esp.cost());

        System.out.println("HouseBlend 커피에 우유를 추가하면 얼마인가요?");
        System.out.println("HouseBlend 클래스만 있어" + "새로 HouseBlendWithSteamedMilk 클래스를 만들어야 합니다.");
        System.out.printf("우유 추가한 HouseBlend는 %.2f입니다.%n", new HouseBlendWithSteamedMilk().cost());

        System.out.println("HouseBlend 커피에 모카를 추가하면 얼마인가요?");
        System.out.println("HouseBlend 클래스만 있어" + "새로 HouseBlendWithMocha 클래스를 만들어야 합니다.");
        System.out.printf("모카 추가한 HouseBlend는 %.2f입니다.%n", new HouseBlendWithMocha().cost());
    }
}
