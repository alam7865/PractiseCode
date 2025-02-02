import java.util.*;

public class numLargest {
    public static void main(String[] args) {
        // int sum = 12;
        // int n = 5;
        // StringBuilder sb = new StringBuilder();
        // int sum1 = 0;
        // while (sum != 0) {
        // int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // for (int i = 0; i < arr.length; i++) {
        // int div = sum / arr[i];
        // char ch = (char) (arr[i] + '0');
        // if (div != 0) {
        // sb.repeat(ch, div);
        // sum -= div * (arr[i]);
        // sum1 += div * (arr[i]);
        // }
        // }
        // }
        // if (sb.length() > n) {
        // System.out.println("-1");
        // } else if (sb.length() == n) {
        // // return sb.toString();
        // System.out.println("sss" + sb.toString());
        // }

        // int num = n - sb.length();
        // sb.repeat('0', num);
        // // System.out.println(sum1);
        // System.out.println(sb.toString());

        ///////////////////////////////////////////

        int sum = 29;
        int n = 3;

        StringBuilder sb = new StringBuilder();
        while (sum != 0) {
            if (sum >= 9) {
                sb.append('9');
                sum -= 9;
            } else {
                sb.append(sum);
                sum -= sum;
            }
        }

        if (sb.length() > n) {
            System.out.println("-1");
        } else if (sb.length() == n) {
            System.out.println(sb.toString());
        }

        int count = n - sb.length();
        while (count-- > 0) {
            sb.append('0');
        }

        System.out.println("Final " + sb.toString());
    }
}
