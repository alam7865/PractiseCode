import java.util.*;

public class calpower {
    // public static int calpower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }

    // if (x == 1) {
    // return 0;
    // }

    // int pow1 = calpower(x, n - 1);
    // int pow2 = x * pow1;
    // return pow2;
    // }

    public static int calpower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 1) {
            return 0;
        }

        int pow1 = calpower(x, n / 2);
        int pow2 = calpower(x, n / 2);
        if (n % 2 == 0) {
            return pow1 * pow2;
        }
        return pow1 * pow2 * x;
    }

    public static void main(String[] args) {
        int n = 5, x = 2;
        int ans1 = calpower(x, n);
        System.out.println(ans1);
    }
}
