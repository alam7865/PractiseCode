import java.util.HashMap;

public class largestSubarraySumK {
    public static void main(String args[]) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                len = Math.max(len, i + 1);
            } else if (map.containsKey(sum - k)) {
                len = Math.max(len, i);
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(len);
    }
}
