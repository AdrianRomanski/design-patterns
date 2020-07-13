package adrianromanski.head_first.factory.factory_method.pizza.poland;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class PolishStyleBreakfastPizza extends Pizza {

    public PolishStyleBreakfastPizza() {
        setName("Polish style breakfast pizza");
        setDough("Thin Crust Dough");
        setSauce("HP Sauce");

        getToppings().add("Egg");
        getToppings().add("Bacon");
        getToppings().add("Sausage");
    }
}
