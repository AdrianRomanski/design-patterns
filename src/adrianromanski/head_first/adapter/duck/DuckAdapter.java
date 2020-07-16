package adrianromanski.head_first.adapter.duck;

import adrianromanski.head_first.adapter.penguin.Penguin;

public class DuckAdapter implements Duck{

    Penguin penguin;

    public DuckAdapter(Penguin penguin) {
        this.penguin = penguin;
    }

    @Override
    public void quack() {
        penguin.gobble();
    }

    @Override
    public void fly() {
        System.out.println("Sorry boss i can't fly");
    }
}
