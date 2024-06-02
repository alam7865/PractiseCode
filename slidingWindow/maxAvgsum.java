import java.util.*;

public class maxAvgsum {
    public static void main(String[] args) {
        int arr[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        double max = 0;

        int index = 0;
        int sum = 0;

        while (index < k) {
            sum += arr[index];
            index++;
        }

        double psum = (double) sum / k;
        max = Math.max(max, psum);
        for (int i = k; i < arr.length; i++) {
            // remove
            sum -= arr[i - k];

            // add
            sum += arr[i];

            double psum1 = (double) sum / k;
            max = Math.max(max, psum1);

        }

        System.out.println(max);
    }
}
