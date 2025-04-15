import java.util.*;

public class pow1 {

    public static int solve(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        int pow = solve(x, n / 2) * solve(x, n / 2);

        if (n % 2 == 0) {
            return pow;
        } else {
            return pow * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;

        int ans = solve(x, n);
        System.out.println("Result: " + ans);
    }
}
