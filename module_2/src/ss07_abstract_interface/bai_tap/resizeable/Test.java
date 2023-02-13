package ss07_abstract_interface.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        double random = Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(random);
        shapes[1] = new Rectangle(random, random);
        shapes[2] = new Square(random);

        for (Shape shape : shapes) {
            System.out.println("Trước khi tăng: " + "\n" + shape);
            shape.resize(Math.random() * 1000);
            System.out.println("Sau khi tăng: " + "\n" + shape);
            System.out.println("\n");
        }
    }
}
