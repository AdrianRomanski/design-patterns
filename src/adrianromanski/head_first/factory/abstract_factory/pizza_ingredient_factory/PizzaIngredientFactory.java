package adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory;

import adrianromanski.head_first.factory.abstract_factory.ingredients.cheese.Cheese;
import adrianromanski.head_first.factory.abstract_factory.ingredients.dough.Dough;
import adrianromanski.head_first.factory.abstract_factory.ingredients.meat.Meat;
import adrianromanski.head_first.factory.abstract_factory.ingredients.sauce.Sauce;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Vegetable;

import java.util.List;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public List<Vegetable> createVegetables();
    public Meat createMeat();

}
