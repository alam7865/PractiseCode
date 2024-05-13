import java.util.*;

public class window {
    public static void main(String[] args) {
        // int n = 7;
        // int k = 4;
        // int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        // ArrayList<Integer> list = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // int i = 0;

        // while (k-- > 0) {
        //     if (map.containsKey(arr[i])) {
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        //     i++;
        // }

        // list.add(map.size());
        // int x = 0;
        // for (int j = i; j < n; j++) {
        //     if (map.containsKey(arr[x])) {
        //         if (map.get(arr[i])==1) {
        //             map.remove(arr[i]);
        //         } else {
        //             map.put(arr[i], map.get(arr[i]) - 1);
        //         }

        //     }
        //     if (map.containsKey(arr[i])) {
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        //     list.add(map.size());
        //     x++;

        // }

        // for (int k1 = 0; k1 < list.size(); k1++) {
        //     System.out.print(list.get(k1) + " ");
        // }





        int n = 7;
        int k = 4;
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;

        while (i < k) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            i++;
        }

        list.add(map.size());
        
        for (int j = k; j < n; j++) {
            if (map.get(arr[j - k]) == 1) {
                map.remove(arr[j - k]);
            } else {
                map.put(arr[j - k], map.get(arr[j - k]) - 1);
            }

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            list.add(map.size());
        }

        for (int k1 = 0; k1 < list.size(); k1++) {
            System.out.print(list.get(k1) + " ");
        }
    }
}
