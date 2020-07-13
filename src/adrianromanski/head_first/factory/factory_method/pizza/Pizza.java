package adrianromanski.head_first.factory.factory_method.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getString(name, dough, sauce, toppings);
    }

    public static String getString(String name, String dough, String sauce, ArrayList<String> toppings) {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }

    public void setName(String name) { this.name = name; }
    public String getDough() { return dough; }
    public void setDough(String dough) { this.dough = dough; }
    public String getSauce() { return sauce; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public ArrayList<String> getToppings() { return toppings; }
    public void setToppings(ArrayList<String> toppings) { this.toppings = toppings; }
}
