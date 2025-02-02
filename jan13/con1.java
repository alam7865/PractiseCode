import java.util.*;

public class con1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };

        int n = arr.length;

        // Expected Sum and Expected Square of sum
        long expedtedSum = (long) n * (n + 1) / 2;
        long expedtedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Actual Sum And Actual SquareSum
        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
            actualSquareSum += arr[i] * arr[i];
        }

        long diffSum = expedtedSum - actualSum; /// missing-repeating
        long diffSquSum = expedtedSquareSum - actualSquareSum; /// missing^2-repeating^2

        long sum = diffSquSum / diffSum; /// missing+repeating

        long missing = (sum + diffSum) / 2;
        long repeating = sum - missing;

        System.out.println(missing);
        System.out.println(repeating);
    }
}
