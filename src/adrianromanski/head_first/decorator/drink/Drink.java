package adrianromanski.head_first.decorator.drink;

public abstract class Drink {
	public String description = "Unknown Drink";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
