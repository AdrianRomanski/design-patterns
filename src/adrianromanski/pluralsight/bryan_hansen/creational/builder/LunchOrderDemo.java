package adrianromanski.pluralsight.bryan_hansen.creational.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").dressing("Mustard").meat("Pork").condiments("Sweet chili").build();

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getCondiments());
    }
}
