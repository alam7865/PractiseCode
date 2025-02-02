import java.util.*;

public class minimumDays {
    public static void main(String[] args) {
        // String str = "aabb";
        // int count = 0;
        // int p[] = { 2, 1, 3, 0 };

        //////////////////////////////////////////////

        String str = "abca";
        int p[] = { 3, 0, 2, 1 };
        int count = 0;
        char arr[] = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            while (arr[i] == arr[i + 1] && arr[i] != '?') {
                // while () {
                arr[p[count]] = '?';
                count++;
                // }
            }
        }

        System.out.println("Result: " + count);
    }
}
