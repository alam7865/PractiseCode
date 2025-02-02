import java.util.*;

public class frequencysort {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 4, 6, 4 };
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            // map.getOrDefault(arr[i],0)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int key = set.getKey();
            int val = set.getValue();

            for (int i = 0; i < val; i++) {
                list.add(key);
            }
        }

        System.out.println(list.toString());
    }
}
