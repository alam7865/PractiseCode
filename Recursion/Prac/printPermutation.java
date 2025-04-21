import java.util.*;

public class printPermutation {

    public static void permutation(String str, String res) {
        if (res.length() >= 3) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, i));
            sb.append(str.substring(i + 1, str.length()));

            // System.out.println(sb.toString() + " " + str.charAt(i));
            permutation(sb.toString(), res + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "123";

        permutation(str, "");
    }
}
