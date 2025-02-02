import java.util.*;

public class balls {
    public static void main(String args[]) {
        String s = "1011";
        long count = 0;

        int i = 0;
        int j = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                i++;
            } else if (s.charAt(i) == '0') {
                count += i - j;
                i++;
                j++;
            }

        }

        System.out.println("Result: " + count);
        // int count = 0;

        // int i = 0;
        // int j = 0;

        // while (i < arr.length && j < arr.length) {
        // if (arr[i] != '1') {
        // i++;
        // }

        // else if (arr[j] != '0') {
        // j++;
        // }

        // else if (arr[i] == '1' && arr[j] == '0') {
        // char temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j++;
        // count++;
        // }

        // System.out.println(Arrays.toString(arr));
        // }

        // System.out.println("Count: " + count);
    }
}