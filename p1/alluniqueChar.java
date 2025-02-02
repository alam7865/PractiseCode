import java.util.*;

public class alluniqueChar {
    public static void main(String args[]) {
        String str = "bbbbb";

        int ans = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() == i - j + 1) {
                ans = Math.max(ans, i - j + 1);
            }

            // remove
            if (map.size() > i - j + 1) {
                while (map.size() > i - j + 1) {
                    char ch1 = str.charAt(j);

                    if (map.containsKey(ch1)) {
                        if (map.get(ch1) == 1) {
                            map.remove(ch1);
                        } else {
                            map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                        }
                    }

                    j++;
                }
            }
        }

        System.out.println(ans);
    }
}
