import java.util.*;

public class rotateArray {

    public static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp1 = arr[low];
            int temp2 = arr[high];

            arr[low] = temp2;
            arr[high] = temp1;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int n = arr.length;
        // int d = 2;
        // reverse(arr, 0, d - 1);
        // reverse(arr, d, n - 1);
        // reverse(arr, 0, n - 1);
        // System.out.println(Arrays.toString(arr));

        System.out.println(1 | 2);
    }
}
