import java.util.*;

public class substring {
    public static void main(String[] args) {
        String str = "10101";
        int k = 1;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length() + 1; j++) {
                // System.out.println(str.substring(i, j));
                int c0 = 0;
                int c1 = 0;
                String ss = str.substring(i, j);

                for (int k1 = 0; k1 < ss.length(); k1++) {
                    char ch = ss.charAt(k1);
                    if (ch == '1') {
                        c1++;
                    } else {
                        c0++;
                    }
                }

                if (c0 <= k || c1 <= k) {
                    System.out.println(ss);
                }
            }
        }
    }
}
