import java.util.*;

public class jobSequencing {
    public static void main(String[] args) {
        int startTime[] = { 1, 2, 3, 3 };
        int endTime[] = { 3, 4, 5, 6 };
        int profit[] = { 50, 10, 40, 70 };
        int n = startTime.length;

        int arr[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]).reversed());
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i)); // Correct for 3D array
        }
    }
}
