import java.util.*;

public class mat {
    public static void main(String[] args) {
        int newInt[] = { 5, 6 };
        int arr[][] = { { 1, 3 }, { 4, 5 }, { 6, 7 }, { 8, 10 } };

        // int first = arr[0][0];
        // int last = arr[0][1];

        // for (int i = 1; i < arr.length; i++) {
        // if (last >= arr[i][0]) {
        // last = Math.max(last, arr[i][1]);
        // } else {
        // System.out.println(first + " " + last);
        // System.out.println();
        // first = arr[i][0];
        // last = arr[i][1];
        // }
        // }

        // System.out.println(first + " " + last);

        ArrayList<int[]> res = new ArrayList<>();
        ArrayList<int[]> res1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            res.add(new int[] { arr[i][0], arr[i][1] });
        }
        res.add(new int[] { newInt[0], newInt[1] });

        // int[] firstArray = res.get(0);
        // System.out.println(Arrays.toString(firstArray));

        /////////////////////////////////////////////////////////////

        int n = res.size();
        int sab[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            int[] firstArray = res.get(i);
            sab[i][0] = firstArray[0];
            sab[i][1] = firstArray[1];
        }

        Arrays.sort(sab, Comparator.comparingDouble(o -> o[0]));
        // for (int[] aa : sab) {
        // System.out.println(Arrays.toString(aa));
        // }

        int first = sab[0][0];
        int last = sab[0][1];

        for (int i = 1; i < sab.length; i++) {
            if (last >= sab[i][0]) {
                // change
                last = Math.max(last, sab[i][1]);
            } else {
                res1.add(new int[] { first, last });
                // System.out.println(first + " " + last);
                first = sab[i][0];
                last = sab[i][1];
            }
        }

        res1.add(new int[] { first, last });
        for (int[] aa : res1) {
            System.out.println(Arrays.toString(aa));
        }

    }
}
