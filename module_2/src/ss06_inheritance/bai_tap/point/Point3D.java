package ss06_inheritance.bai_tap.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
        this(0.0f);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {super.getX(), super.getY(), this.getZ()};
        return arr;
    }

    public String toString() {
        return "Point3D(" +
                super.getX() + ", " +
                super.getY() + ", " +
                this.getZ()
                + ")";
    }
}
