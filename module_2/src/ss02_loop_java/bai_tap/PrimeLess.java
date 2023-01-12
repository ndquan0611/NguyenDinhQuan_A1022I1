package ss02_loop_java.bai_tap;

public class PrimeLess {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            boolean isBoolean = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isBoolean = false;
                    break;
                }
            }
            if (isBoolean) {
                System.out.print(N + ", ");
            }
            N++;
        }
    }
}
