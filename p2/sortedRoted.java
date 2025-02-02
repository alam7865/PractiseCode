import java.util.*;

public class sortedRoted {
    public static void main(String[] args) {
        // int nums[] = { 3, 4, 5, 1, 2 };
        int nums[] = { 11, 11, 1, 20 };

        int nums2[] = nums;
        Arrays.sort(nums2);

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            int k = i;
            int count = 0;

            if (nums[count] == nums2[j]) {
                count++;
            } else {
                continue;
            }
            j++;
            while (j != k && count < n) {
                if (nums[count] == nums2[j % n]) {
                    count++;
                } else {
                    break;
                }
                j++;
            }

            if (count == n) {
                System.out.println("true1");
            }
        }

        System.out.println("False1");
    }
}
