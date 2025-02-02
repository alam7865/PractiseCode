import java.util.*;

public class vowels {
    public static void main(String[] args) {
        String str[] = { "aba", "bcb", "ece", "aa", "e" };
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        int queries[][] = {
                { 0, 2 }, { 1, 4 }, { 1, 1 }
        };

        int n = str.length;

        int res[] = new int[n + 1];
        int ans[] = new int[queries.length];
        int cc = 0;
        for (int i = 1; i <= n; i++) {
            String str1 = str[i - 1];
            if (list.contains(str1.charAt(0)) && list.contains(str1.charAt(str1.length() - 1))) {
                cc++;
                res[i] = cc;
            } else {
                res[i] = cc;
            }
        }

        int x = 0;
        for (int i = 0; i < queries.length; i++) {

            int idx = queries[i][0];
            int lidx = queries[i][1];
            int count = 0;
            count += res[lidx + 1] - res[idx];
            ans[x++] = count;
        }

        System.out.println(Arrays.toString(ans));
    }
}
