import java.util.*;

public class strBal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            a[i] = arr[i];
            b[i] = arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != a[i]) {
                int idx = -1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == a[j]) {
                        idx = j;
                        break;
                    }
                }
                for (int j = idx; j > i; j--) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    count++;
                }
            }
            if (arr[n - 1 - i] != b[i]) {
                int idx = -1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[n - 1 - i] == b[j]) {
                        idx = j;
                        break;
                    }
                }
                for (int j = idx; j > i; j--) {
                    int temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                    count1++;
                }
            }
        }

        System.out.println(Math.min(count, count1));
    }
}
