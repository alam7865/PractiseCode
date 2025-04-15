import java.util.*;

public class movex {
    public static void solve(String str, int i, StringBuilder sb) {
        if (i == str.length()) {
            return;
        }

        if (str.charAt(i) != 'x') {
            sb.append(str.charAt(i));
        }

        solve(str, i + 1, sb);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";

        StringBuilder sb = new StringBuilder();
        int i = 0;
        solve(str, i, sb);
        int len = str.length() - sb.toString().length();

        for (int i1 = 0; i1 < len; i1++) {
            sb.append('x');
        }
        System.out.println(sb.toString());
    }
}
