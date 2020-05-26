package adrianromanski.structural.bridge.shape;

import adrianromanski.structural.bridge.shape.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
