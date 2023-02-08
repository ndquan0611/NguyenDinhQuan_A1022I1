package ss06_inheritance.bai_tap.point;

public class Point2D {
    private float x, y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0.0f, 0.0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D(" +
                this.getX() + ", " +
                this.getY()
                + ")";
    }
}
