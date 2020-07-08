package adrianromanski.head_first.decorator.ingredient;


import adrianromanski.head_first.decorator.drink.Drink;

public class Decaf extends Drink {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

