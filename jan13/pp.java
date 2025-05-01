import java.util.*;

public class pp {
    public static void main(String[] args) {

        int difficulty[] = { 2, 4, 6, 8, 10 };
        int profit[] = { 10, 20, 30, 40, 50 };
        int worker[] = { 4, 5, 6, 7 };
        int n = difficulty.length;

        int mat[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            mat[i][0] = difficulty[i];
            mat[i][1] = profit[i];
        }

        Arrays.sort(mat, Comparator.comparingDouble(o -> o[1]));
        // for (int i[] : mat) {
        // System.out.println(Arrays.toString(i));
        // }

        int result = 0;
        for (int i = 0; i < worker.length; i++) {
            int target = worker[i];

            int low = 0;
            int high = n - 1;
            int ans = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mat[mid][0] <= target) {
                    ans = mat[mid][1];
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            result += ans;
        }

        System.out.println("Result: " + result);
    }
}
