import java.util.*;

public class pp {
    public static void main(String args[]) {
        int arr[] = { 2, 30, 2, 15, 20, 30, 15 };
        int x = 2;

        for (int i = 1; i < arr.length; i++) {
            x ^= arr[i];
        }

        System.out.println(0 ^ 5);
    }
}
