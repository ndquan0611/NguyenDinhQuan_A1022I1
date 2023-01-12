package ss01_introduction_java.bai_tap;

import java.util.Scanner;

public class NumberLetter {
    static String str = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("Zero.");
                    break;
                case 1:
                    System.out.println("One.");
                    break;
                case 2:
                    System.out.println("Two.");
                    break;
                case 3:
                    System.out.println("Three.");
                    break;
                case 4:
                    System.out.println("Four.");
                    break;
                case 5:
                    System.out.println("Five.");
                    break;
                case 6:
                    System.out.println("Six.");
                    break;
                case 7:
                    System.out.println("Seven.");
                    break;
                case 8:
                    System.out.println("Eight.");
                    break;
                case 9:
                    System.out.println("Nine.");
                    break;
                default:
                    System.out.println("Out of ability.");
            }
        } else if (number < 20 && number >= 10) {
            switch (number) {
                case 10:
                    str += "Ten.";
                    break;
                case 11:
                    str += "Eleven.";
                    break;
                case 12:
                    str += "Twelve.";
                    break;
                case 13:
                    str += "Thirteen.";
                    break;
                case 14:
                    str += "Fourteen.";
                    break;
                case 15:
                    str += "Fifteen.";
                    break;
                case 16:
                    str += "Sixteen.";
                    break;
                case 17:
                    str += "Seventeen.";
                    break;
                case 18:
                    str += "Eighteen.";
                    break;
                case 19:
                    str += "Nineteen.";
                    break;
            }
        } else if (number < 100 && number >= 20) {
            switch (number / 10) {
                case 2:
                    str += "Twenty";
                    break;
                case 3:
                    str += "Thirty";
                    break;
                case 4:
                    str += "Forty";
                    break;
                case 5:
                    str += "Fifty";
                    break;
                case 6:
                    str += "Sixty";
                    break;
                case 7:
                    str += "Seventy";
                    break;
                case 8:
                    str += "Eighty";
                    break;
                case 9:
                    str += "Ninety";
                    break;
            }

            switch (number % 10) {
                case 0:
                    str += "";
                    break;
                case 1:
                    str += "One";
                    break;
                case 2:
                    str += "Two";
                    break;
                case 3:
                    str += "Three";
                    break;
                case 4:
                    str += "Four";
                    break;
                case 5:
                    str += "Five";
                    break;
                case 6:
                    str += "Six";
                    break;
                case 7:
                    str += "Seven";
                    break;
                case 8:
                    str += "Eight";
                    break;
                case 9:
                    str += "Nine";
                    break;
            }
        } else if (number < 1000 && number >= 100) {
            switch (number / 100) {
                case 1:
                    str += "One hundred ";
                    break;
                case 2:
                    str += "Two hundred ";
                    break;
                case 3:
                    str += "Three hundred ";
                    break;
                case 4:
                    str += "Four hundred ";
                    break;
                case 5:
                    str += "Five hundred ";
                    break;
                case 6:
                    str += "Six hundred ";
                    break;
                case 7:
                    str += "Seven hundred ";
                    break;
                case 8:
                    str += "Eight hundred ";
                    break;
                case 9:
                    str += "Nine hundred ";
                    break;
            }

            int perNumber = number % 100;

            switch (perNumber / 10) {
                case 2:
                    str += "Twenty ";
                    break;
                case 3:
                    str += "Thirty ";
                    break;
                case 4:
                    str += "Forty ";
                    break;
                case 5:
                    str += "Fifty ";
                    break;
                case 6:
                    str += "Sixty ";
                    break;
                case 7:
                    str += "Seventy ";
                    break;
                case 8:
                    str += "Eighty ";
                    break;
                case 9:
                    str += "Ninety ";
                    break;
            }

            switch (perNumber % 10) {
                case 1:
                    str += "One";
                    break;
                case 2:
                    str += "Two";
                    break;
                case 3:
                    str += "Three";
                    break;
                case 4:
                    str += "Four";
                    break;
                case 5:
                    str += "Five";
                    break;
                case 6:
                    str += "Six";
                    break;
                case 7:
                    str += "Seven";
                    break;
                case 8:
                    str += "Eight";
                    break;
                case 9:
                    str += "Nine";
                    break;
            }
        }
        System.out.println(str);
    }
}
