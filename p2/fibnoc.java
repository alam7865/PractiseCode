import java.util.*;

public class fibnoc {
    public static int solve(int n, int arr[]) {
        if (n <= 1) {
            return n;
        }

        if (arr[n] != -1) {
            return arr[n];
        }
        return solve(n - 1, arr) + solve(n - 2, arr);
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        int ans = solve(n, arr);
        System.out.println("result: " + ans);
    }
}
