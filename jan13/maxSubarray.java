import java.util.*;

public class maxSubarray {
    public static void main(String[] args) {
        int arr[] = {
            83 13 23 82 20 4 83 96 88 50 93 35 5 33 25 2 93 96 32 68 17 99 60 33 14 43 84 56 38 46 67 69 47 6 32 31 71 38 89 63 31 25 72 10 };
        int ans[] = new int[arr.length];

        // ans[0] = arr[0];
        // int max = ans[0];
        // for (int i = 1; i < arr.length; i++) {
        // max = Math.max(max, arr[i]);
        // ans[i] = max;
        // }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            arr[i] = max;
        }

        int k = 4;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[k - 1]);

        for (int i = k; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(list.toString());
    }
}
