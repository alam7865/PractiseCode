import java.util.*;

public class smallDiswindow {
    public static void main(String[] args) {
        // String str = "AABBBCBBAC";
        String str = "aaab";
        HashSet<Character> set = new HashSet<>();

        // Collect all unique characters in the string
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        int k = set.size(); // The number of unique characters
        HashMap<Character, Integer> map = new HashMap<>();
        int n = str.length();
        int i = 0;
        int j = 0;
        String ans = "";
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        // Use sliding window technique

        while (j < n) {
            char ch = str.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() == k) {
                // upgrading minLen && changing minstart
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    // minStart = i;
                    ans = str.substring(i, j + 1);
                }

                // reducing window size

                while (map.size() == k) {
                    char ch1 = str.charAt(i);

                    if (map.containsKey(ch1)) {
                        if (map.get(ch1) == 1) {
                            map.remove(ch1);
                        } else {
                            map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                        }
                    }
                    i++;
                    if (map.size() == k) {
                        if (j - i + 1 < minLen) {
                            minLen = j - i + 1;
                            minStart = i;
                            ans = str.substring(i, j + 1);
                        }
                    }

                }
            }
            j++;
        }

        System.out.println(minLen);
        System.out.println(ans);
    }
}
