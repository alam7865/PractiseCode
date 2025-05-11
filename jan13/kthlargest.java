import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class kthlargest {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        int k = 2;
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                list.add(sum);
            }

        }

        // Collection.sort(list);
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println(list.get(list.size() - k));
        // return list.get(list.size() - k);
    }
}
