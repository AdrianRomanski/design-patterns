package adrianromanski.head_first.facade.catering.breakfast;

import adrianromanski.head_first.facade.catering.breakfast.drinks.Coffee;
import adrianromanski.head_first.facade.catering.breakfast.drinks.Drinks;
import adrianromanski.head_first.facade.catering.breakfast.drinks.FreshOrange;

public class TestBreakfastFacade {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        FreshOrange freshOrange = new FreshOrange();

        Drinks drinks = new Drinks();
        drinks.addDrink(coffee);
        drinks.addDrink(freshOrange);

        BreakfastFacade breakfastFacade = new BreakfastFacade(drinks);

        breakfastFacade.prepareFullBreakFast();
    }
}
