package ss07_abstract_interface.bai_tap.resizeable;

public class Square extends Shape {
    private double side;

    public Square() {
        this(1.0);
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.side + ", " + super.toString() +
                '}' + "\n" + "Diện tích hình vuông: " + this.getArea() ;
    }

    @Override
    public void resize(double percent) {
        this.side *= percent / 100;
    }
}
