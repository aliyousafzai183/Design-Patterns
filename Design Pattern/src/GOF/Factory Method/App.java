import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(ShapeFactory.createShape("circle"));
        shapes.add(ShapeFactory.createShape("square"));
        shapes.add(ShapeFactory.createShape("triangle"));

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
