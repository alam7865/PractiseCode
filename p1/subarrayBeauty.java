import java.util.*;

public class subarrayBeauty {
    public static void main(String args[]) {
        int nums[] = { 1, -1, -3, -2, 3 };
        int k = 3;
        int x = 2;
        int n = nums.length;
        int[] arr1 = new int[55];

        int[] ans = new int[n - k + 1];
        int index = 0;
        int idx = -1;
        int sum = 0;
        int pos = 0;

        while (index < k) {
            if (nums[index] < 0) {
                arr1[nums[index] + 50]++;
            }
            index++;
        }

        // check for first element

        for (int i = 0; i < 55; i++) {
            sum += arr1[i];

            if (sum >= x) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            ans[pos++] = idx - 50;
        } else {
            ans[pos++] = -1;
        }

        for (int i = k; i < n; i++) {
            sum = 0;
            idx = -1;
            // remove

            if (nums[i - k] < 0) {
                arr1[nums[i - k] + 50]--;
            }

            // add
            if (nums[i] < 0) {
                arr1[nums[i] + 50]++;
            }

            for (int i1 = 0; i1 < 55; i1++) {
                sum += arr1[i1];
                if (sum >= x) {
                    idx = i1;
                    break;
                }
            }

            if (idx != -1) {
                ans[pos++] = idx - 50;
            } else {
                ans[pos++] = -1;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
