package adrianromanski.head_first.factory.factory_method.pizza.italy;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class ItalianCheesePizza extends Pizza {

    public ItalianCheesePizza() {

        setName("Italian style cheese pizza");
        setDough("Thin Crust");
        setSauce("Sweet tomato sauce");
    }
}
