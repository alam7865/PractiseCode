import java.util.*;

public class target {

    // public static boolean solve(int arr[], int target, int n) {
    // if (target == 0) {
    // return true;
    // }

    // if (target < 0 || n == 0) {
    // return false;
    // }

    // if (arr[n - 1] <= target) {
    // // include
    // boolean ans1 = solve(arr, target - arr[n - 1], n - 1);
    // // not include
    // boolean ans2 = solve(arr, target, n - 1);

    // return ans1 || ans2;
    // }

    // return solve(arr, target, n - 1);
    // }

    public static boolean solve(int arr[], int target, int n, boolean dp[][]) {
        if (target == 0) {
            return true;
        }

        if (target < 0 || n == 0) {
            return false;
        }

        if (dp[n][target] == true) {
            return true;
        }
        if (arr[n - 1] <= target) {
            // include
            boolean ans1 = solve(arr, target - arr[n - 1], n - 1, dp);
            // not include
            boolean ans2 = solve(arr, target, n - 1, dp);

            return dp[n][target] = ans1 || ans2;
        }

        return dp[n][target] = solve(arr, target, n - 1, dp);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int target = 6;

        // boolean ans = solve(arr, target, arr.length);
        // System.out.println("result: " + ans);

        ////////////////////////// Memoization ///////////////////////////
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][target + 1];

        boolean res = solve(arr, target, n, dp);
        System.out.println("result: " + res);

    }
}
