package adrianromanski.head_first.decorator;

import adrianromanski.head_first.decorator.ingredient.Mocha;
import adrianromanski.head_first.decorator.ingredient.Soy;
import adrianromanski.head_first.decorator.drink.DarkRoast;
import adrianromanski.head_first.decorator.drink.Drink;
import adrianromanski.head_first.decorator.drink.Espresso;
import adrianromanski.head_first.decorator.drink.HouseBlend;
import adrianromanski.head_first.decorator.ingredient.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Drink drink = new Espresso();
		System.out.println(drink.getDescription()
				+ " $" + drink.cost());

		Drink drink2 = new DarkRoast();
		drink2 = new Mocha(drink2);
		drink2 = new Mocha(drink2);
		drink2 = new Whip(drink2);
		System.out.println(drink2.getDescription()
				+ " $" + drink2.cost());

		Drink drink3 = new HouseBlend();
		drink3 = new Soy(drink3);
		drink3 = new Mocha(drink3);
		drink3 = new Whip(drink3);
		System.out.println(drink3.getDescription()
				+ " $" + drink3.cost());
	}
}
