package ss06_inheritance.bai_tap.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "Red");
        System.out.println(circle.getAreaCircle());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(4.5, "Black", 5.4);
        System.out.println(cylinder.getVolumeCylinder());
        System.out.println(cylinder.toString());
    }
}
