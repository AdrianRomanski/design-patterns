package adrianromanski.head_first.factory.abstract_factory.pizza;

import adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory.ItalianIngredientFactory;
import adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory.PizzaIngredientFactory;

public class WhiteMozzarellaPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public WhiteMozzarellaPizza(ItalianIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
