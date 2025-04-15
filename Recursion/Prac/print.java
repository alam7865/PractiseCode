import java.util.*;

public class print {
    // 1 2 3 4 5
    // public static void solve(int n) {
    // if (n <= 0) {
    // return;
    // }
    // solve(n - 1);
    // System.out.print(n + " ");
    // }

    // 5 4 3 2 1
    // public static void solve(int n) {
    // if (n <= 0) {
    // return;
    // }
    // System.out.print(n + " ");
    // solve(n - 1);

    // }

    // sum of first n natural numbers
    // public static int solve(int n, int sum) {
    // if (n <= 0) {
    // return sum;
    // }
    // sum += n;
    // return solve(n - 1, sum);
    // }

    public static int factorial(int n, int fac) {
        if (n <= 0) {
            return fac;
        }

        fac *= n;
        return factorial(n - 1, fac);
    }

    public static void main(String args[]) {
        int n = 5;

        // solve(n);

        // sum of n natural numbers
        // int ans = solve(n, 0);
        int ans = factorial(n, 1);
        System.out.println(ans);
    }
}