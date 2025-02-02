import java.util.*;

public class binary {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1;

        String ss1 = Integer.toBinaryString(n1);
        String ss2 = Integer.toBinaryString(n2);

        int len1 = ss1.length();
        int len2 = ss2.length();
        int min = Math.min(len1, len2);
        len1 = ss1.length() - 1;
        len2 = ss2.length() - 1;
        int x = min;
        int count = 0;
        while (min-- > 0) {
            char ch1 = ss1.charAt(len1--);
            char ch2 = ss2.charAt(len2--);
            // System.out.println(ch1 + " " + ch2);
            if (ch1 != ch2) {
                count++;
            }

            // min--;
        }

        while (len1 != -1) {
            char ch1 = ss1.charAt(len1);
            System.out.println(ch1);
            if (ch1 == '1') {
                count++;
            }
            len1--;
        }

        while (len2 != -1) {
            char ch2 = ss2.charAt(len2);
            if (ch2 == '1') {
                count++;
            }
            len2--;
        }

        System.out.println(count);
    }
}
