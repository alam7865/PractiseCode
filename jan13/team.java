import java.util.*;

public class team {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 4, 1 };

        int team = 0;
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int ls = 0;
            int ll = 0;
            int rl = 0;
            int rs = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    ll++;
                }

                if (arr[j] < arr[i]) {
                    ls++;
                }
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    rl++;
                }

                if (arr[j] < arr[i]) {
                    rs++;
                }
            }

            res += (ls * rl) + (rs * ll);
        }

        System.out.println(res);
    }
}
