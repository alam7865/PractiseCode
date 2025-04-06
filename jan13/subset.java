import java.util.*;

public class subset {
    public static int ans = 0;

    public static void solve(int arr[], int n, StringBuilder sb) {
        if (n <= 0) {
            System.out.println(sb.toString());
            String str = sb.toString();
            int xor = 0;
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';
                // System.out.println(num);
                xor ^= num;
            }

            ans += xor;
            return;
        }

        StringBuilder sbWithElement = new StringBuilder(sb);
        sbWithElement.append(arr[n - 1]);
        solve(arr, n - 1, sbWithElement);

        solve(arr, n - 1, sb);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 17, 2 };
        int n = arr.length;

        StringBuilder sb = new StringBuilder();

        // solve(arr, n, sb);

        // System.out.println("Result: " + ans);

        // char ch = '9';
        // System.out.println(0 ^ 1);

        //////////////////////////
        sb.append(12);
        sb.append(1);
        sb.append(9);

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
    }
}
