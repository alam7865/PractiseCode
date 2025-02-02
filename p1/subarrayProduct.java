import java.util.*;

public class subarrayProduct {
    public static void main(String[] args) {
        // int arr[] = { 10, 5, 2, 6 };
        // int k = 100;

        // int count = 0;
        // int j = 0;
        // int idx = 0;
        // int pro = 1;

        // for (int i = 0; i < arr.length; i++) {
        // pro *= arr[i];

        // // if (pro < k) {
        // // count += i - j + 1;
        // // }

        // while (pro >= k) {
        // pro /= arr[idx];
        // idx++;
        // }

        // if (pro < k) {
        // count += i - idx + 1;
        // }
        // }

        // System.out.println(count);

        int arr[] = { -1, -3 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
