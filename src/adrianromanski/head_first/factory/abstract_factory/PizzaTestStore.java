package adrianromanski.head_first.factory.abstract_factory;

import adrianromanski.head_first.factory.abstract_factory.pizza_store.ItalianPizzaStore;
import adrianromanski.head_first.factory.abstract_factory.pizza.Pizza;

public class PizzaTestStore {

    public static void main(String[] args) {

        ItalianPizzaStore italianPizzaStore = new ItalianPizzaStore();

        Pizza pizza = italianPizzaStore.orderPizza("White Mozzarella");
        System.out.println("Adrian ordered "  + pizza);

        pizza = italianPizzaStore.orderPizza("Pepperoni");
        System.out.println("Adrian ordered "  + pizza);

        pizza = italianPizzaStore.orderPizza("Vegetarian");
        System.out.println("Adrian ordered "  + pizza);

        pizza = italianPizzaStore.orderPizza("Lactose free");
        System.out.println("Adrian ordered "  + pizza);
    }






}
