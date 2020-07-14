package adrianromanski.head_first.factory.factory_method;

import adrianromanski.head_first.factory.factory_method.pizza.Pizza;
import adrianromanski.head_first.factory.factory_method.pizza_store.ItalianPizzaStore;
import adrianromanski.head_first.factory.factory_method.pizza_store.PolishPizzaStore;

public class PizzaTest {

    public static void main(String[] args) {

        PolishPizzaStore polishPizzaStore = new PolishPizzaStore();

        Pizza pizza = polishPizzaStore.orderPizza("breakfast");
        System.out.println(pizza.toString());

        pizza = polishPizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        pizza = polishPizzaStore.orderPizza("meat");
        System.out.println(pizza.toString());

        pizza = polishPizzaStore.orderPizza("summer");
        System.out.println(pizza.toString());

        ItalianPizzaStore italianPizzaStore = new ItalianPizzaStore();

        Pizza pizza2 = italianPizzaStore.orderPizza("cheese");
        System.out.println(pizza2.toString());

        pizza2 = italianPizzaStore.orderPizza("pepperoni");
        System.out.println(pizza2.toString());

        pizza2 = italianPizzaStore.orderPizza("mozzarella");
        System.out.println(pizza2.toString());

        pizza2 = italianPizzaStore.orderPizza("seafood");
        System.out.println(pizza2.toString());
    }




}
