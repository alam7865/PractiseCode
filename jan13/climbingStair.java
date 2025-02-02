import java.util.*;

public class climbingStair {
    public static int solution(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        int left = solution(n - 1);
        int right = solution(n - 2);
        return left + right;
    }

    public static void main(String[] args) {
        int n = 1;

        int ans = solution(n);
        System.out.println(ans);
    }
}
