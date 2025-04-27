import java.util.*;

public class multiply {
    public static void main(String args[]) {
        String num1 = "123";
        String num2 = "456";
        int n = num1.length();
        int m = num2.length();

        int arr[] = new int[n + m];

        // int x1 = arr.length - 1;
        // int c1 = 0;
        // for (int i = n - 1; i >= 0; i--) {
        // // int x = arr.length - 1;
        // int x = x1;
        // x1--;
        // int carry = 0;
        // for (int j = m - 1; j >= 0; j--) {
        // int n1 = num1.charAt(i) - '0';
        // int n2 = num2.charAt(j) - '0';

        // int pro = (n1 * n2) + carry;

        // int last = pro % 10;
        // if (pro > 10) {
        // pro = pro / 10;
        // carry = pro;
        // } else {
        // carry = 0;
        // }

        // int sum = arr[x] + last + c1;

        // int l1 = sum % 10;
        // c1 = sum / 10;
        // arr[x--] = l1;
        // }

        // }
        // if (c1 != 0) {
        // arr[x1] = c1;
        // }
        // System.out.println(Arrays.toString(arr));

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int pro = n1 * n2;
                int sum = pro + arr[i + j + 1];
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }

        }

        int x = 0;
        while (x < arr.length && arr[x] == 0) {
            x++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
