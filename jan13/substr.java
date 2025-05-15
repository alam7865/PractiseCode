import java.util.*;

public class substr {
    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                String str = s.substring(i, j + 1);
                int n1 = str.length();
                System.out.println(str);
                if (str.charAt(0) == str.charAt(n1 - 1)) {
                    count++;
                }
            }
        }
    }
}
