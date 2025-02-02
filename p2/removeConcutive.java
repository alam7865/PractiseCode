import java.util.*;

public class removeConcutive {
    public static void main(String[] args) {
        String s = "aabb";
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        System.out.println(sb.toString());
        for (int i = 1; i < n; i++) {
            if (sb.charAt(sb.length() - 1) != s.charAt(i)) {
                sb.append(s.charAt(i));
            }
        }

        // // return sb.toString();
        System.out.println(sb.toString());
    }
}
