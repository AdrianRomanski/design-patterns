package adrianromanski.head_first.decorator.drink;


import adrianromanski.head_first.decorator.drink.Drink;

public class DarkRoast extends Drink {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

