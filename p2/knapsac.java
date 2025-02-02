import java.util.*;

public class knapsac {

    // public static int solve(int wt[], int val[], int capacity, int n) {
    // if (n <= 0 || capacity <= 0) {
    // return 0;
    // }

    // // include
    // if (wt[n - 1] <= capacity) {
    // // include
    // int ans1 = val[n - 1] + solve(wt, val, capacity - wt[n - 1], n - 1);

    // // exclude
    // int ans2 = solve(wt, val, capacity, n - 1);

    // return Math.max(ans1, ans2);
    // }

    // // not include
    // return solve(wt, val, capacity, n - 1);

    // }

    /////////////////////////// Memoization ////////////////////////////
    public static int solve(int wt[], int val[], int arr[][], int capacity, int n) {
        if (n <= 0 || capacity <= 0) {
            return 0;
        }

        if (arr[n][capacity] != -1) {
            return arr[n][capacity];
        }
        // include
        if (wt[n - 1] <= capacity) {
            // include
            int ans1 = val[n - 1] + solve(wt, val, arr, capacity - wt[n - 1], n - 1);

            // exclude
            int ans2 = solve(wt, val, arr, capacity, n - 1);

            return arr[n][capacity] = Math.max(ans1, ans2);
        }

        // not include
        return arr[n][capacity] = solve(wt, val, arr, capacity, n - 1);

    }

    public static void main(String[] args) {
        int wt[] = { 4, 5, 1 };
        int val[] = { 1, 2, 3 };
        int capacity = 4;

        int n = wt.length;

        //////////////////////////// Resursion ///////////////////////////////
        // int max = Integer.MIN_VALUE;
        // int ans = solve(wt, val, capacity, n);

        // System.out.println("Result: " + ans);

        int arr[][] = new int[n + 1][capacity + 1];

        for (int[] i : arr) {
            Arrays.fill(i, -1);
        }

        int ans = solve(wt, val, arr, capacity, n);
        System.out.println("Result: " + ans);

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
