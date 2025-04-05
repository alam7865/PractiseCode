import java.util.*;

public class gcd {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        int ans = gcd(4, 8);
        System.out.println("Result: GCD: " + ans);
    }
}