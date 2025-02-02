import java.util.*;

public class test {
    public static void main(String[] args) {
        int n = 30;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, 1);
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
