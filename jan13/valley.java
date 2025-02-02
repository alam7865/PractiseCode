import java.util.*;

public class valley {
    public static void main(String[] args) {
        String str = "UDDDUDUU";
        int temp = 0;
        int a = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'D') {
                a = a - 1;
            } else {
                a = a + 1;
            }

            if (a < 0) {
                temp = 1;
            }

            if (temp == 1 && a == 0) {
                count++;
                temp = 0;
            }
        }

        System.out.println(count);
    }
}
