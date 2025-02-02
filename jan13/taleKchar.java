import java.util.*;

public class taleKchar {
    public static void main(String[] args) {
        String str = "aabaaaacaabc";
        int k = 2;
        int ka = 2;
        int kb = 2;
        int kc = 2;

        int a1 = 0;
        int c1 = 0;
        int b1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                a1++;
            } else if (ch == 'b') {
                b1++;
            } else {
                c1++;
            }
        }

        if (a1 < ka || b1 < kb || c1 < kc) {
            System.out.println("Hello");
            System.out.println("False1");
        }

        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int n = str.length();
        a1 = 0;
        b1 = 0;
        c1 = 0;

        while (j < n) {
            char ch = str.charAt(j);
            if (ch == 'a')
                a1++;
            else if (ch == 'b')
                b1++;
            else if (ch == 'c')
                c1++;

            while (a1 >= ka && b1 >= kb && c1 >= kc) {
                // Calculate characters outside the window
                max = Math.max(max, n - (j - i + 1));

                // Shrink the window from the left
                char ch1 = str.charAt(i);
                if (ch1 == 'a')
                    a1--;
                else if (ch1 == 'b')
                    b1--;
                else if (ch1 == 'c')
                    c1--;

                i++; // Move the left pointer
            }
            j++;
        }

        System.out.println(max);

    }

}
