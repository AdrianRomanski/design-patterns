package adrianromanski.pluralsight.bryan_hansen.structural.bridge.shape;

import adrianromanski.pluralsight.bryan_hansen.structural.bridge.shape.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
