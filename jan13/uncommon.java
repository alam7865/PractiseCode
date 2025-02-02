import java.util.*;

public class uncommon {
    public static void main(String[] args) {
        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";

        String s1[] = str1.split(" ");
        String s2[] = str2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length; i++) {
            map.put(s1[i], map.getOrDefault(s1[i], 0) + 1);
        }

        for (int i = 0; i < s2.length; i++) {
            map.put(s2[i], map.getOrDefault(s2[i], 0) + 1);
        }

        int count = 0;
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            int val = set.getValue();
            if (val == 1) {
                count++;
            }
        }

        String ans[] = new String[count];

        int k = 0;
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            int val = set.getValue();
            if (val == 1) {
                ans[k++] = set.getKey();
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
