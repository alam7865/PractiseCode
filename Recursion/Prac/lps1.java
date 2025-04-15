import java.util.*;

public class lps1 {
    public static void main(String[] args) {

        int arr1[] = { 1, 10, 100 };
        int arr2[] = { 1000 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            String str1 = arr1[i] + "";

            for (int j = 0; j < str1.length(); j++) {
                int curr = Integer.parseInt(str1.substring(0, j + 1));
                set.add(curr);
            }
        }

        int ans = 0;

        for (int i = 0; i < arr2.length; i++) {
            String str2 = arr2[i] + "";

            for (int j = ans; j < str2.length(); j++) {
                int curr = Integer.parseInt(str2.substring(0, j + 1));
                if (set.contains(curr)) {
                    ans = j + 1;
                }
            }
        }

        return ans;
    }
}
