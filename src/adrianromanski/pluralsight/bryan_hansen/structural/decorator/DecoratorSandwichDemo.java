package adrianromanski.pluralsight.bryan_hansen.structural.decorator;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new CheeseDecorator(new DressingDecorator(new MeatDecorator(new SimpleSandwich())));

        System.out.println(sandwich.make());
    }



}
