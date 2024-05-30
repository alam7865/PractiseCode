import java.util.*;

public class xor2 {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 2, 1 };

        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> set : map.entrySet()) {
        // if (set.getValue() == 2) {
        // list.add(set.getKey());
        // }
        // }

        // if (list.size() == 1) {
        // System.out.println(list.get(0));
        // }
        // if (list.size() == 2) {
        // System.out.println(list.get(0) ^ list.get(1));
        // }

        // System.out.println((1 ^ 2) + " " + (3 ^ 4));

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int ans = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            ans = ans ^ list.get(i);
        }

        System.out.println(ans);

    }
}
