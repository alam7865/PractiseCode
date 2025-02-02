import java.util.*;

public class MinimalCost {

    // public static int solve(int arr[], int k, int n) {
    // if (n == 0) {
    // return 0;
    // }

    // int ans = Integer.MAX_VALUE;
    // for (int j = 1; j <= k; j++) {
    // if (n - j >= 0) {
    // int jump = solve(arr, k, n - j) + Math.abs(arr[n] - arr[n - j]);
    // ans = Math.min(jump, ans);
    // }
    // }

    // return ans;
    // }

    public static int solve(int arr[], int k, int n, int dp[]) {
        if (n == 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (n - j >= 0) {
                int jump = solve(arr, k, n - j, dp) + Math.abs(arr[n] - arr[n - j]);
                ans = Math.min(jump, ans);
            }
        }

        dp[n] = ans;

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 40, 50, 20 };
        int k = 3; // 30
        int n = arr.length;
        // int ans = solve(arr, k, arr.length - 1);
        // using dp
        int dp[] = new int[arr.length];
        Arrays.fill(dp, -1);
        int ans = solve(arr, k, n - 1, dp);
        System.out.println("Result: " + ans);
    }
}
