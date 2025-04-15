import java.util.*;

public class isSorted1 {

    public static boolean isSorted(int arr[], int n, int idx) {
        if (idx >= n) {
            return true;
        }

        if (arr[idx] <= arr[idx - 1]) {
            return false;
        }

        return isSorted(arr, n, idx + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 4, 5 };
        int n = arr.length;

        boolean ans = isSorted(arr, n, 1);
        System.out.println("result: " + ans);
    }
}