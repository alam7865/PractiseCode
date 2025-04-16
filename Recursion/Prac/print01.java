import java.util.*;

public class print01 {

    public static void solve(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        solve(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            solve(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        solve(3, 0, "");
    }
}
