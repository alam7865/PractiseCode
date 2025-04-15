import java.util.*;

public class lastOccur {
    public static int solve(int arr[], int target, int idx) {
        if (idx < 0) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }
        return solve(arr, target, idx - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 6, 7, 1, 5 };

        int target = 3;
        int n = arr.length;
        int ans = solve(arr, target, n - 1);
        System.out.println("Result: " + ans);
    }
}