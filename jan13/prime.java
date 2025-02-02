import java.util.*;

public class prime {
    public static void main(String args[]) {
        int low = 5;
        int high = 10;
        int arr[] = new int[high + 1];
        for (int i = 2; i <= high; i++) {
            int pres = i + i;
            while (pres <= high) {
                arr[pres] = 1;
                pres += i;
            }
        }

        int count = 0;
        for (int i = low; i <= high; i++) {
            if (arr[i] == 0) {
                count++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("Count: " + count);
    }
}
