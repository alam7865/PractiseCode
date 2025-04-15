import java.util.*;

public class fibonnachi {
    public static void fibonacchi(int a, int b, int n) {
        if (n <= 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
        fibonacchi(a, b, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 5;
        System.out.print(a + " " + b + " ");
        fibonacchi(a, b, n - 2);
    }
}