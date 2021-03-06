package adrianromanski.head_first.factory.simple_factory;

import adrianromanski.head_first.factory.simple_factory.pizza.*;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "clam":
				pizza = new ClamPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
		}
		return pizza;
	}
}
