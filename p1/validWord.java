import java.util.*;

public class validWord {
    public static void main(String[] args) {
        String str = "y0Ap";

        int threeChar = 0;
        int digit = 0;
        int englistlett = 0;
        int vowels = 0;
        int consonent = 0;

        // System.out.println('1'-'0');

        if (str.length() >= 3) {
            threeChar = 1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ch1 = ch - '0';
            if ((ch1 >= 0 && ch1 <= 9) || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                digit++;
            }

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I')
                        || (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U')) {
                    vowels++;
                } else {
                    consonent++;
                }
            }
        }

        if (str.length() < 3) {
            System.out.println("False0");
        } else if (digit != str.length()) {
            System.out.println("False1");
        } else if (vowels <= 0 || consonent <= 0) {
            System.out.println("False2");
        } else {
            System.out.println("True");
        }
    }
}
