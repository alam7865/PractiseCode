import java.util.*;

public class countComSubarr {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 2, 2 };
        int n1 = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(arr[i]);
        }

        // System.out.println(set.size());

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int n = set.size();
        int count = 0;
        while (map.size() < n && i < n1) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.size() == n) {
                count += (n1 - 1) - i + 1;
            }
            i++;
        }

        System.out.println(count);
        int low = 0;
        for (int j = i; j < n1; j++) {
            // remove
            while (map.get(arr[low]) > 1) {
                map.put(arr[low], map.get(arr[low]) - 1);
                if (map.get(arr[low]) == 0) {
                    map.remove(arr[low]);
                }
                if (map.size() == n) {
                    count++;
                }
                low++;
            }

            // add
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            // calculate
            if (map.size() == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
