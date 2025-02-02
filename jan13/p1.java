import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // String s1 = "abcd";
        // String s2 = "abgh";

        // // for (int i = 0; i < s2.length(); i++) {
        // // if (!s1.contains(String.valueOf(s2.charAt(i))))

        // // {
        // // // return -1;
        // // System.out.println("ll");
        // // }

        // // // System.out.println(String.valueOf(s2.charAt(i)));
        // // }

        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();

        // sb1.append("123");
        // System.out.println((sb1.charAt(2) - '0') * 10);

        int n = 10;
        int t = 2;

        int n1 = n;
        while (true) {
            int num = n1;
            if (n1 >= 10) {

                int rem = n1 % 10;

                if (rem == 0) {
                    // return num;
                    System.out.println("aa" + num);
                    break;
                }
                int quo = n1 / 10;

                int pro = rem * quo;
                if (pro % t == 0) {
                    // return num;
                    System.out.println("aa" + num);
                    break;
                }
            }

            if (n1 < 10) {
                if (n1 % t == 0) {
                    // return num;
                    System.out.println("aa" + num);
                    break;
                }
            }

            n1 = n1 + 1;
        }
    }
}
