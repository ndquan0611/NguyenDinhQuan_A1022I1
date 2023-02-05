package ss04_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    private double x1, x2, x;

    private static Scanner sc = new Scanner(System.in);

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
        return delta;
    }

    public double getRoot() {
        x = (-this.getB() / (2 * this.getA()));
        return x;
    }

    public double getRoot1() {
        x1 = ((-this.getB() + Math.sqrt(getDiscriminant())) / (2 * this.getA()));
        return x1;
    }

    public double getRoot2() {
        x2 = ((-this.getB() - Math.sqrt(getDiscriminant())) / (2 * this.getA()));
        return x2;
    }

    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Phương trình bậc 2: ax2 + bc + c = 0");
        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            double x1 = quadraticEquation.getRoot1();
            double x2 = quadraticEquation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm: " + x1 + ", " + x2);
        } else if (delta == 0) {
            double x = quadraticEquation.getRoot();
            System.out.println("Phương trình có nghiệm kép: " + x);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
