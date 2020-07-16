package adrianromanski.head_first.adapter.duck;

public class BlackDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Duck Duck");
    }

    @Override
    public void fly() {
        System.out.println("Fly Fly Duck is Flying");
    }
}
