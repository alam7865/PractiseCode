import java.util.*;

public class minOp {
    public static void main(String[] args) {
        String str = "001";
        int count = 0;

        String ss = "10";
        int n = ss.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ss.charAt(i % n)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
