import java.util.*;

public class contest12 {
    public static void main(String[] args) {
        String str = "ELEELEELLL";
        int count = 1;
        int ans = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count == 0) {
                if (ch == 'E') {
                    ans++;
                    count = 1;
                }
            }
            if (ch == 'E') {
                count--;
            } else {
                count++;
            }
        }

        System.out.println(ans);
    }
}
