import java.util.*;

public class hashset {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 0, -2, 1, -1, 2, -1 };
        int target = 0;

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 1; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int low = j + 1;
                int high = n - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    int sum = arr[i] + arr[j] + arr[mid];
                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[mid]);

                        // skip for third
                        while (low <= high && arr[low] == arr[mid]) {
                            low++;
                        }

                        while (low <= high && arr[high] == arr[mid]) {
                            high--;
                        }
                    }

                    else if (sum > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
    }
}
