package adrianromanski.head_first.decorator.ingredient;

import adrianromanski.head_first.decorator.drink.Drink;

public abstract class CondimentDecorator extends Drink {
	public Drink drink;
	public abstract String getDescription();
}
