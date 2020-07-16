package adrianromanski.head_first.adapter.duck;

import adrianromanski.head_first.adapter.penguin.GiantPenguin;

public class DuckAdapterTest {

    public static void main(String[] args) {

        GiantPenguin giantPenguin = new GiantPenguin();

        Duck duckAdapter = new DuckAdapter(giantPenguin);

        System.out.println("Penguin says");
        giantPenguin.gobble();
        giantPenguin.walk();

        System.out.println("Duck Adapter says");
        testDuck(duckAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
