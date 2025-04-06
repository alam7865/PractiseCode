import java.util.*;

public class contast {

    public static boolean isSorted(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1 };
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int minop = 0;
        while (!isSorted(list)) {
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            int sum = list.get(idx) + list.get(idx + 1);
            list.remove(idx + 1);
            list.set(idx, sum);
            minop++;
        }

        System.out.println(minop);
    }
}
