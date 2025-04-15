import java.util.*;

public class firstLast {
    public static int first = -1;
    public static int last = -1;

    public static void solve(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }

        solve(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int i = 0;

        int key = 10;

        solve(arr, i, key);

        System.out.println("First " + first + " " + "Last " + last);
    }
}
