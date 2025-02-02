import java.util.*;

public class metting {
    public static void main(String[] args) {
        // int start[] = { 75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924 };
        // int end[] = { 112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };

        // int activities[][] = new int[start.length][3];

        // for (int i = 0; i < start.length; i++) {
        // activities[i][0] = i;
        // activities[i][1] = start[i];
        // activities[i][2] = end[i];
        // }

        // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // int count = 1;
        // int endTime = activities[0][2];

        // for (int i = 1; i < start.length; i++) {
        // if (activities[i][1] >= endTime) {
        // count++;
        // endTime = activities[i][2];
        // }
        // }

        // System.out.println(count);

        int arr[][] = { { 5, 7 }, { 1, 3 }, { 9, 10 } };
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

        int n = 10;
        int count = 0;
        int first = arr[0][0];

        int x = first - 1;
        count += x;

        int endTime = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int start = arr[i][0];
            if (start > endTime) {
                count += (start - endTime) - 1;
            }
            endTime = arr[i][1];
        }

        count += n - endTime;

        System.out.println(count);
    }
}
