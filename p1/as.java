import java.util.*;

public class as {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaabb";

        int count = 0;
        char ch = 'a';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (count == 0) {
                ch = c;
                count++;
            } else {
                if (ch == str.charAt(i)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(ch);
                    count = 1;
                    ch = str.charAt(i);
                }

                if (count == 9) {
                    sb.append(9);
                    sb.append(ch);
                    count = 0;
                }
            }
        }

        if (count > 0) {
            sb.append(count);
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }
}
