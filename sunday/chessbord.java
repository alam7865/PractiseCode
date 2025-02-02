import java.util.*;

public class chessbord {
    public static void main(String[] args) {
        // int[][] chess={
        // // 1: white 0:black
        // {1,0,1,0,1,0,1,0},
        // {0,1,0,1,0,1,0,1},
        // {1,0,1,0,1,0,1,0},
        // {0,1,0,1,0,1,0,1},
        // {1,0,1,0,1,0,1,0},
        // {0,1,0,1,0,1,0,1},
        // {1,0,1,0,1,0,1,0},
        // {0,1,0,1,0,1,0,1}
        // };

        // int a = (int) (1e9 + 7);
        // System.out.println(a);
        // int num = 3 / 22;
        // System.out.println(num);
        // if (3 % 22 == 0) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        ///////////////////////////////////////////////////////
        // [5,1,5], k = 22
        // int chalk[] = { 3, 4, 1, 2 }, k = 25;
        //////////////////////////////////////
        // int chalk[] = { 5, 1, 5 }, k = 22;
        // int sum = 0;

        // for (int i = 0; i < chalk.length; i++) {
        // sum += chalk[i];
        // }

        // if (k % sum == 0) {
        // System.out.println("return 0");
        // } else {
        // int x = k / sum;
        // int sum1 = sum * x;
        // k = k - sum1;

        // for (int i = 0; i < chalk.length; i++) {
        // if (chalk[i] <= k) {
        // k = k - chalk[i];
        // } else {
        // System.out.println("Index: " + i);
        // break;
        // }
        // }
        // }

        ///////////////////////////////////////////////////////////////////////

        // System.out.println((int) 'a' - 97);

        String str = "aaba*";
        int arr[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '*') {
                for (int i1 = 0; i1 < 26; i1++) {
                    if (arr[i1] > 0) {
                        arr[i1]--;
                        break;
                    }
                }
            } else {
                int idx = (int) ch - 97;
                arr[idx]++;
            }

        }

        // System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int idx = arr[i];
            char ch = (char) (i + 97);
            if (idx > 0) {
                sb.append(String.valueOf(ch).repeat(idx));
            }
        }
        System.out.println(sb.toString());
    }
}
