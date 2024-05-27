import java.util.*;

public class longestKuniqueChar {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int len = 0;
        while (j < n) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() < k) {
                // map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else if (map.size() == k) {
                int count = 0;
                for (Map.Entry<Character, Integer> set : map.entrySet()) {
                    count += set.getValue();
                }
                len = Math.max(len, count);
            } else if (map.size() > k) {
                while (map.size() > k) {
                    char ch1 = str.charAt(i);
                    if (map.get(ch1) == 1) {
                        map.remove(ch1);
                    } else {
                        map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                    }

                    i++;
                }
            }

            j++;
        }

        System.out.println(len);

    }
}
