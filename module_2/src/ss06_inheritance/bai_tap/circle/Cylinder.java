package ss06_inheritance.bai_tap.circle;

import ss06_inheritance.bai_tap.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getVolumeCylinder() {
        double volume = getR() * 2 * Math.PI;
        return volume;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + this.getR() +
                ", color='" + this.getColor() + '\'' +
                ", height='" + this.getHeight() + '\'' +
                '}';
    }
}
