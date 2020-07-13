package adrianromanski.head_first.factory.factory_method.pizza.poland;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class PolishStyleMeatPizza extends Pizza {

    public PolishStyleMeatPizza() {
        setName("Polish style Meat pizza");
        setDough("Thin Crust Dough");
        setSauce("Spicy Tomato Sauce");

        getToppings().add("Pork");
        getToppings().add("Sausage");
        getToppings().add("Bacon");
        getToppings().add("Chicken");

    }
}
