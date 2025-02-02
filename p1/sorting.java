import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // int arr[] = { 7, 8, 3, 1, 2 };

        // Boubble sort

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // System.out.println(Arrays.toString(arr));

        // selection sort

        // int arr[] = { 7, 8, 3, 1, 2 };
        // int n = arr.length;

        // for (int i = 0; i < n - 1; i++) {
        // int smaller = i;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[smaller] > arr[j]) {
        // smaller = j;
        // }
        // }

        // int temp = arr[smaller];
        // arr[smaller] = arr[i];
        // arr[i] = temp;
        // }

        // System.out.println(Arrays.toString(arr));

        // insertion sort

        int arr[] = { 7, 8, 3, 1, 2 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
