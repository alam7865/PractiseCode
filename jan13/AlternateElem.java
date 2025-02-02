import java.util.*;

public class AlternateElem {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        int n = arr.length;
        int max_idx = n - 1;
        int min_idx = 0;
        int max__elem = arr[max_idx] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max__elem) * max__elem;
                max_idx--;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] += (arr[min_idx] % max__elem) * max__elem;
                min_idx++;
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
