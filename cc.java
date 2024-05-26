import java.util.*;

public class cc {
    public static void main(String[] args) {
        // int arr[] = { 2, 1, 4 };

        // boolean ans1 = true;
        // boolean ans2 = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] % 2 == 0) {
        // ans1 = true;
        // } else {
        // ans1 = false;
        // }

        // if (arr[i + 1] % 2 == 0) {
        // ans2 = true;
        // } else {
        // ans2 = false;
        // }

        // if (ans1 == ans2) {
        // System.out.println("False");
        // }
        // }

        // System.out.println("True");/

        for (int[] query : queries) {
            int from = query[0];
            int to = query[1];
            boolean isSpecial = true;

            for (int i = from; i < to; i++) {
                if (nums[i] % 2 == nums[i + 1] % 2) {
                    isSpecial = false;
                    break;
                }
            }

            results.add(isSpecial);
        }

    }
}
