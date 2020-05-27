package adrianromanski.structural.flyweight.inventory_managment;

public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
