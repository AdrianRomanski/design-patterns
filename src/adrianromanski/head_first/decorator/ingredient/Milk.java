package adrianromanski.head_first.decorator.ingredient;

import adrianromanski.head_first.decorator.drink.Drink;

public class Milk extends CondimentDecorator {
	public Milk(Drink drink) {
		this.drink = drink;
	}


	public String getDescription() {
		return drink.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + drink.cost();
	}
}
