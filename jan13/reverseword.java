import java.util.*;

public class reverseword {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String str1[] = str.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = str1.length - 1; i > 0; i--) {
            sb.append(str1[i]);
            sb.append(".");
        }

        sb.append(str1[0]);

        System.out.println(sb.toString());

    }
}
