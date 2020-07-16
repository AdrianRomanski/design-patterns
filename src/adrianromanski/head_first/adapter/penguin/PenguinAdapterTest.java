package adrianromanski.head_first.adapter.penguin;

import adrianromanski.head_first.adapter.duck.BlackDuck;

public class PenguinAdapterTest {

    public static void main(String[] args) {

        BlackDuck duck = new BlackDuck();

        PenguinAdapter penguinAdapter = new PenguinAdapter(duck);

        System.out.println("Duck");
        duck.quack();
        duck.fly();

        System.out.println("Penguin Adapter");
        testPenguin(penguinAdapter);
    }

    static void testPenguin(Penguin penguin) {
        penguin.gobble();
        penguin.walk();
    }
}
