import java.util.*;

public class num {
    public static void main(String[] args) {
        int num1 = 987, num2 = 879, num3 = 798;
        int numa = num1, numb = num2, numc = num3;

        int a = 0, b = 0, c = 0;

        while (num1 != 0) {
            int rem = num1 % 10;
            a++;
            num1 = num1 / 10;
        }

        while (num2 != 0) {
            int rem = num2 % 10;
            b++;
            num2 = num2 / 10;
        }

        while (num3 != 0) {
            int rem = num3 % 10;
            c++;
            num3 = num3 / 10;
        }
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 4 - a; i++) {
            sb1.append(0);
        }
        sb1.append(numa);
        String str1 = sb1.toString();

        sb1.setLength(0);
        ///
        for (int i = 0; i < 4 - b; i++) {
            sb1.append(0);
        }
        sb1.append(numb);
        String str2 = sb1.toString();
        sb1.setLength(0);

        ////
        for (int i = 0; i < 4 - c; i++) {
            sb1.append(0);
        }
        sb1.append(numc);
        String str3 = sb1.toString();

        int min = -1;
        String ans = "";
        for (int i = 0; i < 4; i++) {
            int z1 = str1.charAt(i) - '0';
            int z2 = str2.charAt(i) - '0';
            int z3 = str3.charAt(i) - '0';

            min = Math.min(z1, Math.min(z2, z3));
            ans += min;
        }
        System.out.println(Integer.parseInt(ans));
        System.out.println(min);
    }
}
