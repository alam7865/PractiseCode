import java.util.*;

public class climbingStair {
    // public static int solve(int n) {
    // if (n == 0) {
    // return 1;
    // }

    // if (n == -1) {
    // return 0;
    // }

    // return solve(n - 1) + solve(n - 2);
    // }

    public static int solve(int arr[], int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        return arr[n] = solve(arr, n - 1) + solve(arr, n - 2);
    }

    public static void main(String[] args) {
        // int n = 3;
        // int ans = solve(n);
        // System.out.println("Result: " + ans);

        //////////////////////// memoization ///////////////////
        int n = 3;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        int ans = solve(arr, n);
        System.out.println(Arrays.toString(arr));
        System.out.println("Result: " + ans);
    }
}
