import java.util.*;

public class rodcut {
    public static int solve(int length[], int price[], int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (length[n - 1] <= w) {
            // include
            int ans1 = price[n - 1] + solve(length, price, w - length[n - 1], n);
            // exclude
            int ans2 = solve(length, price, w, n - 1);

            return Math.max(ans1, ans2);
        } else {
            return solve(length, price, w, n - 1);
        }
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int w = 8;
        int n = price.length;

        int ans = solve(length, price, w, n);
        System.out.println("Result: " + ans);

        ///////////////////////////////////////////////////////////

    }
}
