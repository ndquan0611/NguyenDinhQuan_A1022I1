package ss06_inheritance.bai_tap.circle;

public class Circle {
    private double r;
    private String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAreaCircle() {
        double area = Math.sqrt(this.getR()) * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + this.getR() +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
