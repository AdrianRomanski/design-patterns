package adrianromanski.head_first.factory.factory_method.pizza_store;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;
import adrianromanski.head_first.factory.factory_method.pizza.poland.PolishStyleBreakfastPizza;
import adrianromanski.head_first.factory.factory_method.pizza.poland.PolishStyleCheesePizza;
import adrianromanski.head_first.factory.factory_method.pizza.poland.PolishStyleMeatPizza;
import adrianromanski.head_first.factory.factory_method.pizza.poland.PolishStyleSummerPizza;

public class PolishPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new PolishStyleCheesePizza();
            case "meat":
                return new PolishStyleMeatPizza();
            case "summer":
                return new PolishStyleSummerPizza();
            case "breakfast":
                return new PolishStyleBreakfastPizza();
            default:
                return null;
        }
    }
}
