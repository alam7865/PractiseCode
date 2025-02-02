import java.util.*;

public class validTrin {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4 };
        // Arrays.sort(arr);
        int count = 0;
        int n = arr.length;

        for (int i = n - 1; i >= n - 2; i--) {
            int low = 0;
            int high = i - 1;

            while (low < high) {
                if (arr[low] + arr[high] > arr[i]) {
                    count += high - low;
                    high--;
                } else {
                    low++;
                }
            }

        }
        System.out.println(count);
    }
}
