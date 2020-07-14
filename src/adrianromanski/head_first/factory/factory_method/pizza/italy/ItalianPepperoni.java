package adrianromanski.head_first.factory.factory_method.pizza.italy;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class ItalianPepperoni extends Pizza {

    public ItalianPepperoni() {
        setName("Italian style pepperoni pizza");
        setDough("Thin Crust");
        setSauce("Tomato sauce");

        getToppings().add("Pepperoni");
        getToppings().add("Onions");
    }
}
