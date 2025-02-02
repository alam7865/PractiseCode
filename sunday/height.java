import java.util.*;

public class height {
    public static void main(String[] args) {
        String names[] = { "Mary", "John", "Emma" };
        int heights[] = { 180, 165, 170 };
        int n = names.length;
        String res[] = new String[n];

        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        // for (String s : map) {
        // System.out.println(s);
        // }
        int x = n - 1;
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
            res[x--] = set.getValue();
        }

        System.out.println(Arrays.toString(res));
    }
}
