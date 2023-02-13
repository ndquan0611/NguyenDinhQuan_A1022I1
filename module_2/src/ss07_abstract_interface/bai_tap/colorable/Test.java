package ss07_abstract_interface.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square(3.3);
        for (Shape shape: shapes) {
            System.out.println(shape.toString());
            shape.howToColor();
        }
    }
}
