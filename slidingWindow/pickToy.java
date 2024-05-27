import java.util.*;

public class pickToy {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int k = 2;
        int n = arr.length;

        int i = 0;
        int j = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < n) {
            int num = arr[j];
            // condition
            map.put(num, map.getOrDefault(num, 0) + 1);

            // if equal then Calculate
            if (map.size() == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            // if greater then Remove
            else if (map.size() > k) {
                int num1 = arr[i];

                if (map.get(num1) == 1) {
                    map.remove(num1);
                } else {
                    map.put(num1, map.getOrDefault(num1, 0) - 1);
                }
                i++;
            }

            j++;
        }

        System.out.println(maxLen);
    }
}
