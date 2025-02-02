import java.util.*;

public class allSubarray {
    public static void main(String[] args) {
        // String str = "cbaebabacd";
        String str = "abcabcabcabc";
        String p = "abc";
        int k = p.length();
        int n = str.length();

        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int index = 0;

        while (index < k) {
            char ch = str.charAt(index);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            index++;
        }

        // calculation
        boolean isequal = true;
        if (map1.size() == map2.size()) {
            if (!map1.equals(map2)) {
                isequal = false;
            }

        }

        if (isequal == true) {
            list.add(0);
        }

        for (int i = k; i < n; i++) {
            // remove
            char ch = str.charAt(i - k);
            if (map2.get(ch) == 1) {
                map2.remove(ch);
            } else {
                map2.put(ch, map2.getOrDefault(ch, 0) - 1);
            }

            // add

            char ch1 = str.charAt(i);
            map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);

            if (map1.size() == map2.size()) {
                if (map1.equals(map2)) {
                    list.add((i - (k - 1)));
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
