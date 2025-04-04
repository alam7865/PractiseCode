import java.util.*;

public class BrainPow {
    public static long res[];

    public static long solve(int arr1[], int arr2[], int n, int idx) {
        if (idx >= n) {
            return 0;
        }

        if (res[idx] != -1) {
            return res[idx];
        }
        if (idx < n) {
            // include
            long include = arr1[idx] + solve(arr1, arr2, n, idx + arr2[idx]);
            long exclude = solve(arr1, arr2, n, idx + 1);

            return res[idx] = Math.max(include, exclude);
        } else {
            return res[idx] = solve(arr1, arr2, n, idx + 1);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 12, 78, 63, 79, 13 };
        int arr2[] = { 12, 78, 63, 79, 13 };
        int n = arr1.length;
        res = new long[n];
        int idx = 0;
        Arrays.fill(res, -1);
        long ans = solve(arr1, arr2, n, idx);
        System.out.println("Result: " + ans);
    }
}
