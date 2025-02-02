import java.util.*;

public class prac {
    public static void main(String[] args) {

        String str = "dart";
        int k = 3;

        char ch1[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch1[i] = str.charAt(i);
        }

        int n = str.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(ch1[(i + k) % n]);
        }

        System.out.println(sb.toString());
    }
}
