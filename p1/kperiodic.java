import java.util.*;

public class kperiodic {
    public static void main(String[] args) {
        String str = "leetcodeleet";
        int k = 4;

        HashMap<String, Integer> map = new HashMap<>();

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i = i + k) {
            String ss = str.substring(i, i + k);
            map.put(ss, map.getOrDefault(ss, 0) + 1);
            max = Math.max(max, map.get(ss));
            // System.out.println(ss);
        }

        for (Map.Entry<String, Integer> set : map.entrySet()) {
            sum += set.getValue();
        }
        System.out.println(sum - max);
    }
}
