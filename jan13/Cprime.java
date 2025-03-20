import java.util.*;

public class Cprime {
    public static void main(String[] args) {
        int n = 10;
        boolean arr[] = new boolean[10 + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i <= n; i++) {
            if (arr[i] == true) {
                int pos = i + i;
                while (pos <= n) {
                    if (arr[pos] == true) {
                        arr[pos] = false;
                    }
                    pos += i;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
