/**
 * Created by root on 06/07/2016.
 */
public class CCC {
    public static void main(String arg[]) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

    }
}

interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("SQUARE");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class ShapeFactory {
    Shape getShape(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}
