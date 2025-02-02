import java.util.*;

public class lcm_gcd {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        int i = Math.max(a, b);

        while (true) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 8;

        // int ans = gcd(x, y);
        // System.out.println(ans);

        // int lcm = (x * y) / gcd(x, y);
        // System.out.println(lcm);

        int res1 = lcm(x, y);
        System.out.println(res1);
    }
}
