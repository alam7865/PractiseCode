import java.util.*;

public class printPrime {
    public static void main(String[] args) {
        // int n = 20;
        // boolean arr[] = new boolean[n + 1];
        // Arrays.fill(arr, true);

        // for (int i = 2; i <= 20; i++) {
        // int pos = i;
        // if (arr[i] == true) {
        // while (pos + i <= n) {
        // arr[pos + i] = false;
        // pos += i;
        // }
        // }
        // }

        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 2; i <= 20; i++) {
        // if (arr[i] == true) {
        // list.add(i);
        // }
        // }

        ////////////////////////////////////////////
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.remove(list.size() - 1);
        System.out.println(list.toString());
    }
}
