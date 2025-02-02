import java.util.*;

public class largeNum {
    public static void main(String[] args) {
        int nums[] = { 3, 30, 34, 5, 9 };

        int n = nums.length;
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }

        String str = sb.toString();
        if (sb.charAt(0) == '0') {
            // return "0";
        }

        // return str;
        System.out.println(str);
    }
}
