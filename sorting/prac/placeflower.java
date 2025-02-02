import java.util.*;

public class placeflower {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 0, 1 };
        int len = arr.length;
        int count = 0;
        int n = 2;

        // base case
        if (len == 1) {
            if (arr[0] == 0 && n == 1) {
                count++;
                System.out.println("True 0");
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (arr[i - 1] == 0 && arr[i + 1] == 0) {
                    count++;
                    arr[i] = 1;
                }
            }
        }

        // end case

        if (arr[n - 1] == 0) {
            if (arr[n - 2] == 0) {
                count++;
            }
        }

        if (count >= n) {
            System.out.println("True1");
        } else {
            System.out.println("False1");
        }
    }
}
