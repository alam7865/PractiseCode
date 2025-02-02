import java.util.*;

public class pp {
    public static void main(String[] args) {
        String s = "1522";

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < n - 1; i++) {

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);

            int num1 = (int) (ch1 - '0');
            int num2 = (int) (ch2 - '0');

            if (num1 != num2) {
                if (map.get(ch1) == num1 && map.get(ch2) == num2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch1);
                    sb.append(ch2);

                    System.out.println(sb.toString());
                    // return sb.toString();
                }
            }

        }
    }
}
