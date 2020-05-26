package adrianromanski.structural.bridge.shape;

import adrianromanski.structural.bridge.shape.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
