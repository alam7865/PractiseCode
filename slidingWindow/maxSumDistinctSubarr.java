import java.util.*;

public class maxSumDistinctSubarr {
    public static void main(String[] args) {
        // int arr[] = { 1, 5, 4, 2, 9, 9, 9 };
        // int k = 3;

        int arr[] = { 4, 4, 4 };
        int k = 3;
        long sum = 0;
        int index = 0;
        long maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (index < k) {
            map.put(arr[index], map.getOrDefault(arr[index], 0) + 1);
            sum += arr[index];
            index++;
        }

        if (map.size() == k) {
            maxSum = Math.max(maxSum, sum);
        }

        for (int i = k; i < arr.length; i++) {
            // remove

            if (map.containsKey(arr[i - k])) {
                if (map.get(arr[i - k]) == 1) {
                    map.remove(arr[i - k]);
                } else {
                    map.put(arr[i - k], map.getOrDefault(arr[i - k], 0) - 1);
                }

                sum -= arr[i - k];
            }

            // add
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            sum += arr[i];

            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
