package ss02_loop_java.bai_tap;

public class ShowTypes {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
