import java.util.*;

public class countComSubarr {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 2, 2 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int key = set.getKey();
            int val = set.getValue();
            if (val == 1) {
                list.add(key);
            }
        }

        map.clear();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), 1);
        }

        System.out.println(map.toString());
    }
}
