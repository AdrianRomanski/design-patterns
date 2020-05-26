package adrianromanski.structural.bridge.shape;

import adrianromanski.structural.bridge.shape.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
