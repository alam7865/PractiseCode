import java.util.*;

public class knapsac01 {

    // public static int solve(int w, int val[], int wt[], int n) {
    // if (n == 0 || w == 0) {
    // return 0;
    // }

    // if (wt[n - 1] <= w) {
    // // include
    // int include = val[n - 1] + solve(w - wt[n - 1], val, wt, n - 1);

    // // exclude
    // int exclude = solve(w, val, wt, n - 1);

    // return Math.max(include, exclude);
    // } else {
    // return solve(w, val, wt, n - 1);
    // }
    // }

    ///////////////////////////////////
    public static int solve(int w, int val[], int wt[], int dp[][], int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) {
            // include
            int include = val[n - 1] + solve(w - wt[n - 1], val, wt, dp, n - 1);

            // exclude
            int exclude = solve(w, val, wt, dp, n - 1);

            return dp[n][w] = Math.max(include, exclude);
        } else {
            return dp[n][w] = solve(w, val, wt, dp, n - 1);
        }
    }

    public static void main(String[] args) {
        int w = 5;
        int val[] = { 10, 40, 30, 50 };
        int wt[] = { 5, 4, 2, 3 };
        int n = val.length;

        // int ans = solve(w, val, wt, n);
        // System.out.println("Result: " + ans);

        // memoization

        int dp[][] = new int[n + 1][w + 1];

        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        int ans = solve(w, val, wt, dp, val.length);
        System.out.println("Result: " + ans);
        // int dp[][] = new int[n + 1][n + 1];

        // for (int i = 1; i < n + 1; i++) {
        // for (int j = 1; j < n + 1; j++) {
        // if (wt[n - 1] <= w) {
        // dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j] + val[i - 1]);
        // } else {
        // dp[i][j] = dp[i - 1][j];
        // }
        // }
        // }

        // System.out.println(dp[n][n]);
    }
}