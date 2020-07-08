package adrianromanski.head_first.decorator.ingredient;

import adrianromanski.head_first.decorator.drink.Drink;

public class Soy extends CondimentDecorator {
	public Soy(Drink drink) {
		this.drink = drink;
	}

	public String getDescription() {
		return drink.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + drink.cost();
	}
}
