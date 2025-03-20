import java.util.*;

public class containerWater {
    public static void main(String[] args) {
        // int arr[] = { 1, 5, 4, 3 };
        int arr[] = { 3, 1, 2, 4, 5 };
        // Ans: 6

        int n = arr.length;
        int ans = 0;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int minHeight = Math.min(arr[low], arr[high]);
            int minDis = high - low;

            int area = minHeight * minDis;
            if (ans <= area) {
                ans = area;
            }

            if (arr[low] <= arr[high]) {
                low++;
            } else {
                high--;
            }

        }

        System.out.println("result: " + ans);
    }
}
