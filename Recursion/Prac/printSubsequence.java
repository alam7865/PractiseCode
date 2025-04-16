import java.util.*;

public class printSubsequence {

    public static void solve(int idx, String res, String str) {
        if (idx > 2) {
            System.out.println(res);
            return;
        }

        solve(idx + 1, res + str.charAt(idx), str);
        solve(idx + 1, res, str);
    }

    public static void main(String args[]) {
        String str = "abc";
        solve(0, "", str);
    }
}
