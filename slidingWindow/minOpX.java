import java.util.*;

public class minOpX {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 20, 1, 1, 3 };
        int k1 = 10;

        int min = -1;
        int sum = 0;
        int j = 0;
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        int k = sum1 - k1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                min = Math.max(min, i - j + 1);
            }

            if (sum > k) {
                while (sum > k) {
                    sum -= arr[j];
                    j++;

                    if (sum == k) {
                        min = Math.max(min, i - j + 1);
                    }
                }
            }
        }

        if (min == -1) {
            System.out.println("-1");
        } else {
            System.out.println(arr.length - min);
        }
    }
}
