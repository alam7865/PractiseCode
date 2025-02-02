// package sorting.prac;

import java.util.*;

public class pair {
    public static void main(String args[]) {
        int arr1[] = { 10, 20 };
        int arr2[] = { 10, 13, 16, 19 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int idx1 = 0;
        int idx2 = 0;

        int min = Integer.MAX_VALUE;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            int diff = Math.abs(arr1[idx1] - arr2[idx2]);
            min = Math.min(min, diff);

            if (arr1[idx1] > arr2[idx2]) {
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                idx1++;
            } else {
                idx1++;
                idx2++;
            }
        }

        // if(min=Integer.)
        System.out.println(min);
    }
}
