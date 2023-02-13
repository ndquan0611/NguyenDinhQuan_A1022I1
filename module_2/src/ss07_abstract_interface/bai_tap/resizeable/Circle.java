package ss07_abstract_interface.bai_tap.resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius + ", " + super.toString() +
                '}' + "\n" + "Diện tích hình tròn: " + this.getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent / 100;
    }
}
