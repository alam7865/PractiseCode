import java.util.*;

public class fixedWindow {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3; // 12
        int maxsum = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxsum = Math.max(maxsum, sum);

        int j = 0;
        while (k < arr.length) {
            // Decrease
            sum -= arr[j++];
            // Increment
            sum += arr[k];
            // calculation
            maxsum = Math.max(maxsum, sum);
            System.out.print(maxsum + " ");
            k++;
        }
        System.out.println();
        System.out.println(maxsum);
    }
}
