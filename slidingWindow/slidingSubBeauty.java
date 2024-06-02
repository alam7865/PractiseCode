import java.util.*;

public class slidingSubBeauty {
    public static void main(String[] args) {
        int arr[] = { -3, 1, 2, -3, 0, -3 }; // -3,0,-3,-3,-3
        int n = arr.length;
        int k = 2;
        int x = 1;
        int[] arr1 = new int[55];
        int[] ans = new int[n - k + 1];

        int index = 0;
        while (index < k) {
            if (arr[index] < 0) {
                arr1[arr[index] + 50]++;
            }
            index++;
        }

        int p = 0;

        long sum = 0;
        int idx = -1;

        for (int j = 0; j < 55; j++) {
            sum += arr1[j];

            if (sum >= x) {
                idx = j;
                break;
            }
        }

        if (idx != -1) {
            ans[p] = idx - 50;
        } else {
            ans[p] = 0;
        }
        p++;

        for (int i = k; i < n; i++) {

            sum = 0;
            idx = -1;
            // remove
            if (arr[i - k] < 0) {
                arr1[arr[i - k] + 50]--;
            }

            // add
            if (arr[i] < 0) {
                arr1[arr[i] + 50]++;
            }

            // calculation

            for (int j = 0; j < 55; j++) {
                sum += arr1[j];

                if (sum >= x) {
                    idx = j;
                    break;
                }
            }

            if (idx != -1) {
                ans[p] = idx - 50;
            } else {
                ans[p] = 0;
            }
            p++;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
