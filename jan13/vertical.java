import java.util.*;

public class vertical {
    public static void main(String[] args) {
        String str = "daccad";

        StringBuilder sb = new StringBuilder();
        String middle = "";
        int count[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            count[idx]++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }

            for (int j = 0; j < count[i] / 2; j++) {
                char cc = (char) (i + 'a');
                sb.append((cc));
            }
        }

        String secondHalf = sb.reverse().toString();
        String ans = sb.reverse().toString() + middle + secondHalf;
        System.out.println(ans);

    }
}
