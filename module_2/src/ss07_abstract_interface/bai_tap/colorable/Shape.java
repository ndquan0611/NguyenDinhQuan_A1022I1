package ss07_abstract_interface.bai_tap.colorable;

public class Shape implements IColorable {
    private String color;
    private boolean filled;

    public Shape() {
        this("Red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color='" + this.getColor() + '\'' +
                ", filled=" + this.isFilled();
    }

    @Override
    public void howToColor() {

    }
}
