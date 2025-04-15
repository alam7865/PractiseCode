import java.util.*;

public class strRev {
    public static void solve(String str, int i, StringBuilder sb) {
        if (i == str.length()) {
            return;
        }
        solve(str, i + 1, sb);
        sb.append(str.charAt(i));
    }

    public static void main(String[] args) {
        String str = "sabaz";
        int i = 0;

        StringBuilder sb = new StringBuilder();
        solve(str, i, sb);

        System.out.println(sb.toString());
    }
}
