package adrianromanski.head_first.decorator.drink;

public class HouseBlend extends Drink {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

