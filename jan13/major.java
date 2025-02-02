import java.util.*;

public class major {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 3, 2 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > n / 2) {
                // return arr[i];
                System.out.println(arr[i]);
            }
        }

        // return -1;
        System.out.println("-1");
    }
}
