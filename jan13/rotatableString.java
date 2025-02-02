import java.util.*;

public class rotatableString {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        String ss = s1 + s1;

        String str = s1 + s1;

        int s2len = s2.length();

        for (int i = 0; i < str.length() - s2len; i++) {
            int pp = i + s2len;
            String ps = str.subString(i, pp);
            if (ps.equals(s2)) {
                return true;
            }
        }

        return false;
    }
}
