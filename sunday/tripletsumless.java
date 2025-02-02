// import java.util.*;

// public class tripletsumless {
//     public static void main(String[] args) {
//         // int arr[] = { -2, 0, 1, 3 };
//         // int sum = 2;
//         // int n = 4;
//         // int count = 0;
//         // Arrays.sort(arr);
//         // for (int i = 0; i < n - 2; i++) {
//         // int j = i + 1;
//         // int k = n - 1;

//         // while (j < k) {
//         // int sum1 = arr[i] + arr[j] + arr[k];
//         // if (sum1 < sum) {
//         // count += (k - j);
//         // j++;
//         // } else {
//         // k--;
//         // }
//         // }
//         // }

//         // System.out.println(count);
//         String str = "131";
//         boolean swap = false;
//         int arr[] = new int[str.length()];

//         for (int i = 0; i < str.length(); i++) {
//             arr[i] = str.charAt(i) - '0';
//             // System.out.println(arr[i] * 5);
//         }
//         for (int i = 0; i < arr.length - 1; i++) {
//             int x = arr[i];
//             int y = arr[i + 1];

//             if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
//                 if (x > y && swap == false) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                     swap = true;
//                 }
//                 // break;
//             }
//         }

//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < arr.length; i++) {
//             sb.append(arr[i]);
//         }
//         System.out.println(sb.toString());

//     }
// }

///////////////////////////////////////
class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        // Sort the arrays
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        // count of cut
        int hor = 1, ver = 1;

        // total cost
        long total = 0;

        int i = horizontalCut.length - 1;// horizontalCut Index
        int j = verticalCut.length - 1; // verticalCut Index
        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] >= verticalCut[j]) {
                total += (long) horizontalCut[i] * ver;
                hor++;
                i--;
            } else {
                total += (long) verticalCut[j] * hor;
                ver++;
                j--;
            }
        }

        while (j >= 0) {
            total += (long) verticalCut[j] * hor;
            ver++;
            j--;
        }
        while (i >= 0) {
            total += (long) horizontalCut[i] * ver;
            hor++;
            i--;
        }
        return (int) total;
    }
}