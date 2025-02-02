import java.util.*;

public class adjacent {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 8, 9, 2, 3, 4, 3, 1 };
        int k = 3;

        int c = k - 1;
        int n = arr.length;

        for (int i = c; i < n - k; i++) {
            if (arr[i] > arr[i + 1]) {
                // int m1=0;
                int t1 = -1;
                int t2 = -1;
                int x1 = i;
                for (int m1 = 0; m1 < k - 1; m1++) {
                    if (arr[x1] > arr[x1 - 1]) {
                        x1--;
                    } else {
                        System.out.println("false1");
                        t1 = 0;
                        break;
                    }
                }

                int x2 = i + 1;
                // int m2=0;
                for (int m2 = 0; m2 < k - 1; m2++) {
                    if (arr[x2] < arr[x2 + 1]) {
                        x2++;
                    } else {
                        System.out.println("false2");
                        t2 = 0;
                        break;
                    }
                }

                if (t1 == -1 && t2 == -1) {
                    System.out.println("True Sabaz");
                    break;
                }
            }
        }
    }
}
