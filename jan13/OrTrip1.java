import java.util.*;

public class OrTrip1 {
    public static long solve(int arr[]) {
        int n = arr.length;
        long max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i < j && j < k) {
                        long res = (arr[i] - arr[j]) * arr[k];
                        max = Math.max(max, res);
                    }
                }
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 10, 3, 4, 19 };
        int n = arr.length;

        long ans = solve(arr);
        System.out.println("Result: " + ans);
    }
}
