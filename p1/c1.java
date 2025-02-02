import java.util.*;

public class c1 {
    public static void main(String[] args) {
        int arr[] = { 10, 100, 105 };
        Arrays.sort(arr);
        int count = 0;
        int pres = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pres++;
            if (arr[i] != pres) {
                count++;
                pres = arr[i];
            }
        }

        count++;

        System.out.println(count);
    }
}
