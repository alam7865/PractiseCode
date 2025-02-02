import java.util.*;

public class frog {
    public static void main(String args[]) {
        int n = 3;
        int leaves = 4;
        int frogs[] = { 3, 2, 4 };

        int arr[] = new int[leaves + 1];

        for (int i = 0; i < frogs.length; i++) {
            int pres = frogs[i];

            while (pres < arr.length) {
                if (arr[pres] == 0) {
                    arr[pres] = 1;
                }
                pres += frogs[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
