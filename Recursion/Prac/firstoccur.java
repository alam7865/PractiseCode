import java.util.*;

public class firstoccur {
    // First occurance

    // public static int solve(int arr[], int key, int i) {
    // if (i == arr.length) {
    // return -1;
    // }

    // if (arr[i] == key) {
    // return i;
    // }
    // return solve(arr, key, i 1);
    // }

    // last occurance
    public static int solve(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return solve(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        // int i = 0;
        int i = arr.length - 1;

        int ans = solve(arr, key, i);
        System.out.println(ans);

    }
}
