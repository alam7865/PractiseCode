import java.util.*;

public class mgrInter {
    public static void main(String[] args) {
        String str = "acbbcc";
        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            map.put(ch, i);
        }

        int end = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            end = Math.max(end, map.get(ch));
            if (end == i) {
                count++;
            }
        }

        System.out.println("Count: " + count);

    }

}
