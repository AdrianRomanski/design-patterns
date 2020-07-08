package adrianromanski.head_first.decorator.drink;

public class Espresso extends Drink {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

