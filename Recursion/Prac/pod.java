import java.util.*;

public class pod {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2 };
        int n = arr.length;

        int x = arr[0];

        for (int i = 1; i < arr.length; i++) {
            x ^= arr[i];
        }

        System.out.println(x);
    }
}
