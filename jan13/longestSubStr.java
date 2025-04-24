import java.util.*;

public class longestSubStr {
    public static void main(String args[]) {
        String str = "abcabcbb"; // 3
        int low = 0;
        int max = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            // add
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // remove
            while (map.get(ch) > 1) {
                char ch1 = str.charAt(low);
                map.put(ch1, map.get(ch1) - 1);
                low++;
                if (map.get(ch1) == 0) {
                    map.remove(ch1);
                }
            }

            max = Math.max(max, map.size());
            // System.out.println("hi");
        }

        System.out.println("MAX: " + max);
    }
}
