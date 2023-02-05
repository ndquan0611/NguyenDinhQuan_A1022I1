package ss04_class_object.bai_tap;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String str;
        if (this.getOn()) {
            str = "Speed: " + this.getSpeed() + "; Color: " + this.getColor() + "; Radius: " + this.getRadius() + "; fan is on.";
        } else {
            str = "Color: " + this.getColor() + "; Radius: " + this.getRadius() + "; fan is off.";
        }
        return str;
    }

    public static void main(String[] args) {
        Fan fanFirst = new Fan(FAST, true, 10, "yellow");
        Fan fanSecond = new Fan(MEDIUM, false, 5, "blue");
        System.out.println(fanFirst);
        System.out.println(fanSecond);
    }
}
