import java.util.*;

public class lenLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    int len1 = (j - i) + 1;
                    if (len1 > len) {
                        len = len1;
                    }

                }
            }
        }

        System.out.println("Result: " + len);
    }
}
