import java.util.*;

public class issorted {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 0, 5 };
        int i = 0;

        boolean ans = issorted(arr, i);
        System.out.println(ans);
    }
}
