package ss01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'ax + b = c', please enter constants:");

        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Giá trị a: " + a);

        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Giá trị b: " + b);

        System.out.print("Nhập c: ");
        c = sc.nextDouble();
        System.out.println("Giá trị c: " + c);

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
