import java.util.*;

public class largestGroup {
    public static void main(String args[]) {
        int n = 13;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int num1 = i;
            int sum1 = 0;

            while (num1 != 0) {
                int last = num1 % 10;
                sum1 += last;
                num1 = num1 / 10;
                // System.out.println(sum1);
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            for (int j = i + 1; j <= n; j++) {
                int num2 = j;
                int sum2 = 0;

                while (num2 != 0) {
                    int last = num2 % 10;
                    sum2 += last;
                    num2 = num2 / 10;
                }

                if (sum1 == sum2) {
                    list.add(j);

                    // System.out.println(sum1 + " " + sum2);
                }
            }

            map.put(i, list.size());
        }

        int max = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            max = Math.max(max, set.getValue());
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == max) {
                count++;
            }
        }

        System.out.println(count);
    }
}
