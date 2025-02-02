import java.util.*;

public class minConsucitiveCards {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 2, 3, 4, 7 };
        int min_Len = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int idx = map.get(arr[i]);
                min_Len = Math.min(min_Len, i - idx + 1);
                map.put(arr[i], i);
            } else {
                map.put(arr[i], i);
            }
        }

        System.out.println(min_Len);
    }
}
