import java.util.*;

public class kNapsac {
    // public static int K_napsac(int val[], int wt[], int w, int n) {
    // if (n == 0 || w == 0) {
    // return 0;
    // }

    // if (wt[n - 1] <= w) {
    // // Include
    // int ans1 = val[n - 1] + K_napsac(val, wt, w - wt[n - 1], n - 1);

    // // Exclude
    // int ans2 = K_napsac(val, wt, w, n - 1);

    // return Math.max(ans1, ans2);
    // } else {
    // return K_napsac(val, wt, w, n - 1);
    // }
    // }

    //////////////////////////////////////// Memoization
    //////////////////////////////////////// //////////////////////////////////////

    public static int K_napsac(int val[], int wt[], int w, int n, int dp[][]) {

        if (n == 0 || w == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) {
            // Include
            int ans1 = val[n - 1] + K_napsac(val, wt, w - wt[n - 1], n - 1, dp);
            // Exclude
            int ans2 = K_napsac(val, wt, w, n - 1, dp);

            int ans = Math.max(ans1, ans2);
            dp[n][w] = ans;
            return dp[n][w];
        } else {
            dp[n][w] = K_napsac(val, wt, w, n - 1, dp);
            return dp[n][w];
        }

    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        int w = 7;
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = K_napsac(val, wt, w, n, dp);
        System.out.println("Result: " + ans);
    }
}