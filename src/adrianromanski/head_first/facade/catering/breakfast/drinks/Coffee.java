package adrianromanski.head_first.facade.catering.breakfast.drinks;

public class Coffee implements Drink {

    private final Double cost;
    private int prepareTime;


    public Coffee() {
        this.cost = 1.2;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Coffee");
        boilingWater();
        grind();
        pourOver();
        heatingMilk();
        putMilk();
        System.out.println("Ready in " + prepareTime + " seconds");
    }

    @Override
    public int getTime() {
        return this.prepareTime;
    }

    void boilingWater() {
        System.out.println("Boiling Water");
        this.prepareTime+=4;
    }

    void heatingMilk() {
        System.out.println("Heating Milk");
        this.prepareTime+=8;
    }

    void grind() {
        System.out.println("Grinding Coffee beans");
        this.prepareTime+=12;
    }

    void pourOver() {
        System.out.println("Pouring Coffee");
        this.prepareTime+=2;
    }

    void putMilk() {
        System.out.println("Adding milk");
        this.prepareTime+=2;
    }


}
