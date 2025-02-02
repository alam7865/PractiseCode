import java.util.*;

public class test1 {
    public static void main(String[] args) {
        // int arr[] = { 0, 1, 0, 1, 1, 0 }; // 0 0 0 1 1 1

        // int count = 0;
        // int count1 = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // count++;
        // } else {
        // count1++;
        // }
        // }

        // for (int i = 0; i < count; i++) {
        // arr[i] = 0;
        // }

        // for (int i = count; i < arr.length; i++) {
        // arr[i] = 1;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        //////////////////////////////////////////////////////////////

        // int arr[] = { 1, 15, 23, 12, 4000 };

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] > arr[j]) {
        // // swap
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }

        // }

        // System.out.println(Arrays.toString(arr));

        ////////////////////////////////////////////////////////////////////

        int arr1[] = { 0, 2, 3 };
        int arr2[] = { 1, 5 };
        // B = [1, 5]
        int ans[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    count++;
                }
            }

            // System.out.print(count + " ");
            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));
    }
}
