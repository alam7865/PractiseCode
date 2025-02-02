import java.util.*;

public class remReveer {
    public static void main(String[] args) {
        String s = "abab";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = s.length() - 1;
        boolean forword = true;

        StringBuilder sb = new StringBuilder(s);

        while (left <= right) {
            if (forword) {
                if (map.get(sb.charAt(left)) > 1) {
                    map.put(sb.charAt(left), map.get(sb.charAt(left)) - 1);
                    sb.deleteCharAt(left);
                    right--;
                    forword = false;
                } else {
                    left++;
                }
            } else {
                if (map.get(sb.charAt(right)) > 1) {
                    map.put(sb.charAt(right), map.get(sb.charAt(right)) - 1);
                    sb.deleteCharAt(right);
                    right--;
                    forword = true;
                } else {
                    right--;
                }
            }
        }

        if (forword == false) {
            sb.reverse();
        }
        System.out.println(sb.toString());

    }
}
