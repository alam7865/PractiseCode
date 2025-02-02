import java.util.*;

public class interval1 {

    public static int solve(int arr[], int sum, int count, int target, int n) {
        if (sum == target) {
            return count;
        }

        if (n <= 0) {
            return Integer.MAX_VALUE;
        }
        // include
        // int ss = sum + arr[n - 1];
        // int c1 = count--;
        int include = solve(arr, sum + arr[n - 1], count + 1, target, n
                - 1);

        // Exclude
        int exclude = solve(arr, sum, count, target, n - 1);

        return Math.min(include, exclude);
    }

    // public static int solve(int arr[], int sum, int count, int target, int n) {
    // // Base case: If target is met, return count
    // if (sum == target) {
    // return count;
    // }

    // // Base case: If no elements left to process, return an invalid value
    // if (n <= 0) {
    // return Integer.MAX_VALUE; // Or another invalid value to signify no solution
    // }

    // // Include current element
    // int include = solve(arr, sum + arr[n - 1], count + 1, target, n - 1);

    // // Exclude current element
    // int exclude = solve(arr, sum, count, target, n - 1);

    // // Return the minimum count from both paths
    // return Math.min(include, exclude);
    // }

    public static void main(String[] args) {
        // int arr[] = new int[10];

        // Arrays.fill(arr, 2, 4, 7);

        // System.out.println(Arrays.toString(arr));

        int arr[] = { 2, 3, 4 };
        int ans = solve(arr, 0, 0, 6, arr.length);
        System.out.println("Result " + ans);
    }
}
