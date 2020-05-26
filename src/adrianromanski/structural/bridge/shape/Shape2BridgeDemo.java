package adrianromanski.structural.bridge.shape;

import adrianromanski.structural.bridge.shape.color.Blue;
import adrianromanski.structural.bridge.shape.color.Color;
import adrianromanski.structural.bridge.shape.color.Green;
import adrianromanski.structural.bridge.shape.color.Red;

public class Shape2BridgeDemo {

    public static void main(String[] args) {

        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCircle = new Circle(green);

        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();
    }
}
