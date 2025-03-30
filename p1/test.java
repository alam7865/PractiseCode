import java.util.*;

public class test {

    public static int CalSum(int arr[], int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // System.out.println(Arrays.toString(arr));
            int ans = CalSum(arr, n);
            System.out.println("Sum: " + ans);
        }
    }
}
