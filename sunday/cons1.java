import java.util.*;

public class cons1 {
    public static void main(String[] args) {
        String str = "abaacbcbb";

        int arr[] = new int[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (ch - 0) - 97;
            arr[idx]++;
            if (arr[idx] == 3) {
                arr[idx] = 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            count += arr[i];
        }

        System.out.println(count);
    }
}
