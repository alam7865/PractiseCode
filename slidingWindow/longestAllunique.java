import java.util.*;

public class longestAllunique {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int len = 0;
        while (j < n) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() == j - i + 1) {
                int count = 0;
                len = Math.max(len, j - i + 1);
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
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
