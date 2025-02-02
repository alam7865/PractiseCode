import java.util.*;

public class mouseHoles {
    public static void main(String[] args) {
        int arr1[] = { -4, 2, 3 };
        int arr2[] = { 0, -2, 4 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            ans = Math.max(ans, Math.abs(arr1[i] - arr2[i]));
        }

        System.out.println(ans);
    }
}
