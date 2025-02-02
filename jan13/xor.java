import java.util.*;

public class xor {
    public static void main(String[] args) {
        // // int arr[] = { 1, 3, 4, 8 };
        // // int queries[][] = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };

        // int arr[] = { 16 };
        // int queries[][] = { { 0, 0 }, { 0, 0 }, { 0, 0 } };

        // int res[] = new int[arr.length];
        // int pres = arr[0];
        // res[0] = pres;

        // for (int i = 1; i < arr.length; i++) {
        // pres = pres ^ arr[i];
        // res[i] = pres;
        // }

        // for (int i = 0; i < queries.length; i++) {
        // int first = queries[i][0];
        // int last = queries[i][1];

        // if (first == 0) {
        // System.out.println(res[last]);
        // } else if (first == last) {
        // System.out.println(res[first] ^ res[last]);
        // } else {
        // System.out.println(res[last] ^ (res[first - 1]));
        // }
        // }
        // // System.out.println(1 ^ 3);
        // // System.out.println(3 ^ 4);
        // // System.out.println(1 ^ 3 ^ 4 ^ 8);
        // // System.out.println(8 ^ 8);

        //////////////////////////////////////////////////////////////////
        // System.out.println(3 & 3 & 3 & 3);
        // System.out.println(3 & 3 & 3 & 2);

        // int arr[] = { 1, 2, 3, 5, 3, 2, 2, 2, 5, 5, 2 };
        int arr[] = { 100, 5, 5 };
        // int arr[] = { 1, 2, 3, 3, 2, 2 };

        // int max = 1;
        // int pres = arr[0];
        // int count = 1;

        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] == pres) {
        // count++;
        // max = Math.max(max, count);
        // } else {
        // pres = arr[i];
        // count = 1;
        // }
        // }

        // System.out.println(max);

        ///////////////////////////////////////////////////
        int max1 = arr[0];
        int pres1 = arr[0];
        int maxpres = -1;
        int max = 1;
        int pres = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            max1 = Math.max(max1, arr[i]);
            if (arr[i] == pres) {
                count++;
                // max = Math.max(max, count);
                if (count > max) {
                    max = count;
                    maxpres = arr[i];
                }
            } else {
                pres = arr[i];
                count = 1;

                if (arr[i] > pres1) {
                    pres1 = arr[i];
                }
            }
        }

        System.out.println(max1);
        System.out.println(pres1);
        System.out.println(maxpres);
        System.out.println(max);
    }
}
