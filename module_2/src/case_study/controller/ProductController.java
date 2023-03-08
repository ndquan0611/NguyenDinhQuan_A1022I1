package case_study.controller;

import java.util.Scanner;

public class ProductController {
    static final Scanner sc = new Scanner(System.in);

    public static void displayMainMethod() {
        int select;
        do {
            System.out.println("-------Student Management------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(sc.nextLine());

            switch (select) {

            }
        } while (true);
    }

    public static void main(String[] args) {

    }
}
