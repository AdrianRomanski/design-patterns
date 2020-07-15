package adrianromanski.head_first.factory.abstract_factory.pizza_store;

import adrianromanski.head_first.factory.abstract_factory.pizza.*;
import adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory.ItalianIngredientFactory;

public class ItalianPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza;
        ItalianIngredientFactory ingredientFactory = new ItalianIngredientFactory();

        switch (item) {
            case "White Mozzarella":
                pizza = new WhiteMozzarellaPizza(ingredientFactory);
                pizza.setName("White Mozzarella Pizza");
                return pizza;

            case "Pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Pepperoni Pizza");
                return pizza;

            case "Vegetarian":
                pizza = new VegetarianPizza(ingredientFactory);
                pizza.setName("Vegetarian Pizza");
                return pizza;

            case "Lactose free":
                pizza = new LactoseFreePizza(ingredientFactory);
                pizza.setName("Lactose free Pizza");
                return pizza;

            default:
                return null;
        }
    }
}
