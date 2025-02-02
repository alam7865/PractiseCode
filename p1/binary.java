import java.util.*;

public class binary {
    public static void main(String[] args) {
        String str = "10";
        long sum = 0;
        int n = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            sum += num * Math.pow(2, n--);
        }

        System.out.println(sum + 1);
    }
}
