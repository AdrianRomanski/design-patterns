package adrianromanski.head_first.factory.factory_method.pizza.italy;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class ItalianSeafoodPizza extends Pizza {

    public ItalianSeafoodPizza() {
        setName("Italian style seafood pizza");
        setDough("Thin Crust");
        setSauce("Rosemary sauce");

        getToppings().add("Prawns");
        getToppings().add("Crab");
        getToppings().add("Octopus");
    }
}
