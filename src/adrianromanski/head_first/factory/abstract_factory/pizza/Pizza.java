package adrianromanski.head_first.factory.abstract_factory.pizza;

import adrianromanski.head_first.factory.abstract_factory.ingredients.cheese.Cheese;
import adrianromanski.head_first.factory.abstract_factory.ingredients.dough.Dough;
import adrianromanski.head_first.factory.abstract_factory.ingredients.meat.Meat;
import adrianromanski.head_first.factory.abstract_factory.ingredients.sauce.Sauce;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Meat meat;
    List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (meat != null) {
            result.append(meat);
            result.append("\n");
        }
        if (vegetables != null) {
            for (int i = 0; i < vegetables.size(); i++) {
                result.append(vegetables.get(i).toString());
                if (i < vegetables.size()-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}

