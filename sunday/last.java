import java.util.*;

public class last {
    public static void main(String[] args) {
        String str = "hkrrtbxwkabeihgcdqew";

        int count = 0;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (ch > 0 && ch == ' ') {
                // return count;
                break;
            }

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
                // System.out.print(count+" ");
            }
        }

        System.out.println(count);
    }
}
