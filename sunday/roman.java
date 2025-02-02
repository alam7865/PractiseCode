import java.util.*;

public class roman {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        String str = "XLVII";
        int n = str.length();
        char c = str.charAt(n - 1);
        sum += map.get(c);
        for (int i = n - 2; i >= 0; i--) {
            char ch = str.charAt(i);
            if (map.get(ch) >= map.get(c)) {
                sum += map.get(ch);
            } else {
                sum -= map.get(ch);
            }

            c = ch;
        }

        System.out.println(sum);
    }
}
