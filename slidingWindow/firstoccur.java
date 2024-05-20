import java.util.*;

public class firstoccur {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
                
            }
        }
    }
}
