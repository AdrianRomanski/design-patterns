package adrianromanski.head_first.factory.factory_method.pizza.italy;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;

public class ItalianWhiteMozzarellaPizza extends Pizza {

    public ItalianWhiteMozzarellaPizza() {
        setName("Italian style white mozarella pizza");
        setDough("Thin Crust");
        setSauce("Tomato sauce");

        getToppings().add("White mozzarella");
        getToppings().add("Basil");
        getToppings().add("Cherry Tomatoes");
    }
}
