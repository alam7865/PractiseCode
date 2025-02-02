import java.util.*;

public class maxpointsCard {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        // ans: 12

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int index = 0;

        while (index < k) {
            sum += arr[index];
            index++;
        }

        max = Math.max(max, sum);

        int last = arr.length - 1;
        int count = 0;

        int idx = k - 1;
        for (int i = 0; i < k; i++) {
            // remove
            sum -= arr[idx--];

            // add
            sum += arr[last--];

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
