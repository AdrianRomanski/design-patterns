package adrianromanski.head_first.facade.catering.breakfast;

import adrianromanski.head_first.facade.catering.breakfast.drinks.Drink;
import adrianromanski.head_first.facade.catering.breakfast.drinks.Drinks;


public class BreakfastFacade {

    private int timeLimit;
    private Drinks drinks;

    public BreakfastFacade(Drinks drinks) {
        this.drinks = drinks;
    }

    public void prepareFullBreakFast() {
        drinks.getDrinks().forEach(Drink::prepare);
        breakfastPrepared();
    }

    private void breakfastPrepared() {
        int time = countTime();
        StringBuilder sb = new StringBuilder();
        sb.append("Breakfast prepared in ");
        sb.append(time / 60 + " minutes ");
        sb.append(" and " + time % 60 + " seconds");
        System.out.println(sb.toString());
    }

    private int countTime() {
        return drinks.getTotalTime();
    }
}
