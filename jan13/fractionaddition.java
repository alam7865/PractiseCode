import java.util.*;

public class fractionaddition {
    public static long gcd(long a, long b) {
        if (a == b) {
            return a;
        }

        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        String expression = "-1/2+1/2+1/3";
        String frs[] = expression.split("(?=[+-])");
        long num = 0;
        long den = 1;

        for (String fr : frs) {
            String[] curr = fr.split("/");
            long a = Long.parseLong(curr[0]);
            long b = Long.parseLong(curr[1]);
            num = num * b + a * den;
            den = den * b;
        }

        if (num == 0) {
            System.out.println("0/1");
        }

        long gcd1 = gcd(Math.abs(num), Math.abs(den));
        num = num / gcd1;
        den = den / gcd1;

        System.out.println(num + "/" + den);
    }
}
