import java.util.*;

public class bulb {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1 };
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                count++;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = 1;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
