import java.util.*;

public class digit3 {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 0 };

        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 111; i <= 999; i++) {
            if (i % 2 == 0) {
                int num = i;
                HashMap<Integer, Integer> map2 = new HashMap<>();

                while (num != 0) {
                    int rem = num % 10;
                    map2.put(rem, map2.getOrDefault(rem, 0) + 1);
                    num = num / 10;
                }

                int ans = 0;
                for (Map.Entry<Integer, Integer> set : map2.entrySet()) {
                    int key = set.getKey();
                    int val = set.getValue();

                    if (map1.containsKey(key) && val <= map1.get(key)) {

                    } else {
                        ans = 1;
                        break;
                    }
                }

                if (ans == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
