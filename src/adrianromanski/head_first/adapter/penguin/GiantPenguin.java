package adrianromanski.head_first.adapter.penguin;

public class GiantPenguin implements Penguin{

    @Override
    public void gobble() {
        System.out.println("Penguin Penguin");
    }

    @Override
    public void walk() {
        System.out.println("Walking like a boss");
    }
}
