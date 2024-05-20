import java.util.*;

public class subarraySumDivk {
    public static void main(String[] args) {
        // int arr[] = { 2, 7, 6, 1, 4, 5 };
        // int arr[] = { -2, 2, -5, 12, -11, -1, 7 };
        int arr[] = { -1, 9, 0 };
        int k = 9;

        int sum = 0;
        int len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            if (rem == 0) {
                len = Math.max(len, i + 1);
            }

            if (map.containsKey(rem)) {
                len = Math.max(len, i - map.get(rem));
            }

            if (!map.containsKey(rem)) {
                map.put(rem, i);
            }
        }

        System.out.println(len);
    }
}
