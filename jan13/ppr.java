import java.util.*;

public class ppr {
    public static void main(String[] args) {
        int arr1[] = { 1, 12, 15, 26, 38 };
        int arr2[] = { 2, 13, 17, 30, 45 };

        int n = 5;
        int min = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;
        int count = 0;

        while (count < n) {
            if (arr1[x] < arr2[y]) {
                min = arr2[y];
                min = Math.min(min, arr1[x]);
                x++;
            } else if (arr1[x] > arr2[y]) {
                min = arr1[x];
                min = Math.min(min, arr2[y]);
                y++;
            } else {
                min = arr1[x];
                x++;
            }
            count++;
        }

        System.out.println(min);
        // System.out.println(arr1[x] + " " + arr2[y]);
        int min2 = Math.min(arr1[x], arr2[y]);
        System.out.println("Min2: " + min2);
    }
}
