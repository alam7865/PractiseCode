import java.util.*;

public class VlargestSubwithsumk {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 3, 5, 5 };

        int k = 16;
        // ans=4; 5 2 7 1

        long sum = 0;
        int len = 0;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            sum += arr[j];

            if (sum < k) {
                j++;
            } else if (sum == k) {
                len = Math.max(len, j - i + 1);
                j++;
            } else if (sum > k) {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }

        System.out.println(len);
    }
}
