package adrianromanski.head_first.factory.abstract_factory.pizza;

import adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }
}
