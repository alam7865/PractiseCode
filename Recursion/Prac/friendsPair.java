import java.util.*;

public class friendsPair {

    public static int solve(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int pair1 = solve(n - 1);
        // Multiple
        int pairs = solve(n - 2);
        int totalPairsFor2 = (n - 1) * pairs;

        return pair1 + totalPairsFor2;
    }

    public static void main(String args[]) {
        int n = 4;

        int ans = solve(n);
        System.out.println("Result: " + ans);
    }
}
