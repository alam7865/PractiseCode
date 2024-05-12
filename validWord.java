import java.util.*;

public class validWord {
    public static void main(String[] args) {
        String str = "234Adas";

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
            if ((ch1 >= 1 && ch1 <= 9) && (ch>='a' && ch<='z')) {
                digit++;
            }

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonent++;
                }
            }
        }


        if(threeChar==1 && )
    }
}
