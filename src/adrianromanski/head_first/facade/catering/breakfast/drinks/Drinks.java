package adrianromanski.head_first.facade.catering.breakfast.drinks;

import java.util.ArrayList;
import java.util.List;

public class Drinks {

    private List<Drink> drinks;
    private int totalTime;

    public Drinks() {
        this.drinks = new ArrayList<>();
    }

    public int getTotalTime() {
        for(Drink d: drinks) {
            totalTime+= d.getTime();
        }
        return totalTime;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }


}
