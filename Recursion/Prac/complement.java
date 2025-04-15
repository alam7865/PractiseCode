import java.util.*;

public class complement {
    public static void main(String[] args) {
        int num = 10;
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int rem = num % 2;
            // System.out.println(rem);
            sb.append(rem);
            num = num / 2;
        }
        sb.reverse();
        // System.out.println(sb.toString());
        int idx = 0;
        int sum = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char ss = sb.charAt(i);
            if (ss == '0') {
                sum += (int) Math.pow(2, idx);
                // System.out.print(sum + " ");
            }
            idx++;

        }

        // System.out.println(Math.pow(2, 1));
        System.out.println(sum);
    }
}
