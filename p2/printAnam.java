import java.util.*;

public class printAnam {
    public static void main(String[] args) {
        String arr[] = { "act", "god", "cat", "dog", "tac" };

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            char strChar[] = str.toCharArray();
            Arrays.sort(strChar);
            String str1 = new String(strChar);

            if (map.containsKey(str1)) {
                map.get(str1).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(str1, list);
            }
        }

        for (Map.Entry<String, ArrayList<String>> set : map.entrySet()) {
            String key = set.getKey();
            ArrayList<String> val = set.getValue();

            System.out.println(key + " " + val);
        }
    }
}
