package ss07_abstract_interface.bai_tap.resizeable;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.getWidth() +
                ", length=" + this.getLength() +
                ", " + super.toString() +
                '}' + "\n" + "Diện tích hình chữ nhật: " + this.getArea();
    }

    @Override
    public void resize(double percent) {
        this.width *= percent / 100;
        this.length *= percent / 100;
    }
}
