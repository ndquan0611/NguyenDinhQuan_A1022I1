package ss06_inheritance.thuc_hanh;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
