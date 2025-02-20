import java.util.*;

public class partition {

    public static void partition(int i, String str) {
        if (i == str.length()) {
            return;
        }

        String str1 = str.substring(0, i);
        String str2 = str.substring(i);
        System.out.println(str1 + " " + str2);
        System.out.println();
        partition(i + 1, str);

    }

    public static void main(String[] args) {
        String str = "123";

        // for (int i = 0; i < str.length(); i++) {
        //     partition(i, str);
        // }

        String str1="1 2 3 4 5";
        int arr[]=In
    }
}
