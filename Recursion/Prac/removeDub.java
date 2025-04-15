import java.util.*;

public class removeDub {
    public static String result = "";

    public static void solve(int arr[], String str, int idx, int n) {
        if (idx >= n) {
            return;
        }

        int i = str.charAt(idx) - 'a';
        arr[i]++;
        if (arr[i] == 1) {
            result += str.charAt(idx);
        }

        solve(arr, str, idx + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = new int[26];

        String str = "sabbaj";

        solve(arr, str, 0, str.length());

        System.out.println("result: " + result);
    }
}
