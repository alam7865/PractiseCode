import java.util.*;

public class map {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, map.getOrDefault(1, 0) + 1);
        map.put(1, map.getOrDefault(1, 0) + 1);
        map.put(1, map.getOrDefault(1, 0) - 1);
        map.put(1, map.getOrDefault(1, 0) - 1);
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }
}
