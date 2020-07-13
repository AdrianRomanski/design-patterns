package adrianromanski.head_first.factory.factory_method.pizza.poland;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class PolishStyleSummerPizza extends Pizza {

    public PolishStyleSummerPizza() {
        setName("Polish style Summer pizza");
        setDough("Thin Crust Dough");
        setSauce("Herb Tomato Sauce");

        getToppings().add("Onion");
        getToppings().add("Garlic");
        getToppings().add("Blood Sausage");
    }
}
