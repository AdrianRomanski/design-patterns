package adrianromanski.head_first.decorator.ingredient;

import adrianromanski.head_first.decorator.drink.Drink;

public class Mocha extends CondimentDecorator {
	public Mocha(Drink drink) {
		this.drink = drink;
	}
 
	public String getDescription() {
		return drink.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + drink.cost();
	}
}
