package adrianromanski.head_first.adapter.penguin;

import adrianromanski.head_first.adapter.duck.Duck;

public class PenguinAdapter implements Penguin{

    Duck duck;

    public PenguinAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        System.out.println("Quack Quack");
    }

    @Override
    public void walk() {
        System.out.println("I rather to fly, but can walk if i have to");
    }
}
