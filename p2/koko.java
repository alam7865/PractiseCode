import java.util.*;

public class koko {
    public static void main(String[] args) {
        int piles[] = { 16, 16 };
        int h = 8;

        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            high = Math.max(piles[i], high);

        }

        // System.out.println(high);
        while (low <= high) {
            // int mid=(low+high)/2;
            int mid = low + (high - low) / 2;
            int hours = 0;
            for (int i = 0; i < n; i++) {
                hours += (piles[i] / mid);

                if (piles[i] % mid != 0) {
                    hours += 1;
                }
            }

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // return ans;
        System.out.println(ans);
    }
}
