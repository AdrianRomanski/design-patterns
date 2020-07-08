package adrianromanski.head_first.decorator.ingredient;

import adrianromanski.head_first.decorator.drink.Drink;
import adrianromanski.head_first.decorator.ingredient.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Drink drink) {
		this.drink = drink;
	}
 
	public String getDescription() {
		return drink.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + drink.cost();
	}
}
