package adrianromanski.head_first.facade.catering.breakfast.drinks;

public class FreshOrange implements Drink {

    private int prepareTime;
    private final Double cost;

    public FreshOrange() {
        this.cost = 2.2;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Fresh Orange");
        wash();
        squeeze();
    }

    @Override
    public int getTime() {
        return this.prepareTime;
    }

    void wash() {
        System.out.println("Washing");
        this.prepareTime+=10;
    }

    void squeeze() {
        System.out.println("Squeezing");
        this.prepareTime+=20;
    }
}
