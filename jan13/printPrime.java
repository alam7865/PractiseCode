import java.util.*;

public class printPrime {
    public static void main(String[] args) {
        int n = 20;
        boolean arr[] = new boolean[n + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i <= 20; i++) {
            int pos = i;
            if (arr[i] == true) {
                while (pos + i <= n) {
                    arr[pos + i] = false;
                    pos += i;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= 20; i++) {
            if (arr[i] == true) {
                list.add(i);
            }
        }

    }
}
