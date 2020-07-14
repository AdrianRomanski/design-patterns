package adrianromanski.head_first.factory.factory_method.pizza_store;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;
import adrianromanski.head_first.factory.factory_method.pizza.italy.ItalianCheesePizza;
import adrianromanski.head_first.factory.factory_method.pizza.italy.ItalianPepperoni;
import adrianromanski.head_first.factory.factory_method.pizza.italy.ItalianSeafoodPizza;
import adrianromanski.head_first.factory.factory_method.pizza.italy.ItalianWhiteMozzarellaPizza;

public class ItalianPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ItalianCheesePizza();
            case "pepperoni":
                return new ItalianPepperoni();
            case "mozzarella":
                return new ItalianWhiteMozzarellaPizza();
            case "seafood":
                return new ItalianSeafoodPizza();
            default:
                return null;
        }
    }
}
