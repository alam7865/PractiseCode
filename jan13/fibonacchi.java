import java.util.*;

public class fibonacchi {
    // public static int solve(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // if (n <= 0) {
    // return 0;
    // }
    // int left = solve(n - 1);
    // int right = solve(n - 2);
    // int sum = left + right;
    // return sum;
    // }

    public static int solveMem(int n) {
        int arr[] = new int[n + 1];
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[n];

    }

    public static void main(String[] args) {
        int n = 5;

        // int ans = solve(n);
        // System.out.println("Result: " + ans);

        int ans = solveMem(n);
        System.out.println("Return: " + ans);
    }
}