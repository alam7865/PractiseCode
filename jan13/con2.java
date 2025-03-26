import java.util.*;

public class con2 {
    public static void main(String[] args) {
        int arr[] = { -1, 40, -14, 7, 6, 5, -4, -1 };
        int n = arr.length;

        int currsum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum > 0) {
                currsum = 0;
            }

            minSum = Math.min(minSum, currsum);
        }

        System.out.println(minSum);
    }
}
