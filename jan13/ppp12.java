import java.util.*;

public class ppp12 {

    public static int solve(int arr1[], int arr2[], int n, int idx) {
        if (idx >= n) {
            return 0;
        }

        if (idx < n) {
            // include
            int include = arr1[idx] + solve(arr1, arr2, n, idx + arr2[idx] + 1);
            // exclude
            int exclude = solve(arr1, arr2, n, idx + 1);

            return Math.max(include, exclude);
        } else {
            return solve(arr1, arr2, n, idx + 1);
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                // { 3, 2 }, { 4, 3 }, { 4, 4 }, { 2, 5 }
                { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }
        };

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 5 };
        int n = arr1.length;

        int ans = solve(arr1, arr2, n, 0);
        System.out.println("Result: " + ans);
    }
}
