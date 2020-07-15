package adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory;

import adrianromanski.head_first.factory.abstract_factory.ingredients.cheese.Cheese;
import adrianromanski.head_first.factory.abstract_factory.ingredients.cheese.WhiteMozzarella;
import adrianromanski.head_first.factory.abstract_factory.ingredients.dough.Dough;
import adrianromanski.head_first.factory.abstract_factory.ingredients.dough.ThinDough;
import adrianromanski.head_first.factory.abstract_factory.ingredients.meat.Meat;
import adrianromanski.head_first.factory.abstract_factory.ingredients.meat.Pepperoni;
import adrianromanski.head_first.factory.abstract_factory.ingredients.sauce.Sauce;
import adrianromanski.head_first.factory.abstract_factory.ingredients.sauce.TomatoSauce;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Corn;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Mushrooms;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Onion;
import adrianromanski.head_first.factory.abstract_factory.ingredients.vegatable.Vegetable;
import adrianromanski.head_first.factory.abstract_factory.pizza_ingredient_factory.PizzaIngredientFactory;

import java.util.Arrays;
import java.util.List;

public class ItalianIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new WhiteMozzarella();
    }

    @Override
    public List<Vegetable> createVegetables() {
        return Arrays.asList(new Onion(), new Mushrooms(), new Corn());
    }

    @Override
    public Meat createMeat() {
        return new Pepperoni();
    }
}
