import java.util.*;

public class permutation {
    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidboaoo";

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            System.out.println("Not Found");
            // break;
        }

        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
        }

        int index = 0;
        while (index < len1) {
            char ch2 = s2.charAt(index);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
            index++;
        }

        if (map1.size() == map2.size()) {
            if (map1.equals(map2)) {
                System.out.println("Found1");
            }
        }

        for (int i = len1; i < len2; i++) {
            // remove
            char ch1 = s2.charAt(i - len1);
            if (map2.containsKey(ch1)) {
                if (map2.get(ch1) == 1) {
                    map2.remove(ch1);
                } else {
                    map2.put(ch1, map2.getOrDefault(ch1, 0) - 1);
                }
            }

            // add
            char ch2 = s2.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);

            // calculation
            if (map1.size() == map2.size()) {
                if (map1.equals(map2)) {
                    System.out.println("Found3");
                    break;
                }
            }
        }

        System.out.println("Not found AnyWhere");
    }
}
