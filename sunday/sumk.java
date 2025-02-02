import java.util.*;

public class sumk {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int i = 0;
        int j = 0;
        int s = 12;
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (sum < s) {
                j++;
            } else if (sum == s) {
                list.add(i + 1);
                list.add(j + 1);
                System.out.println(list.toString());
                break;
            } else if (sum > s) {
                while (sum > s) {
                    sum -= arr[i];
                    i++;
                }
                if (sum == s) {
                    list.add(i + 1);
                    list.add(j + 1);
                    System.out.println(list.toString());
                    break;
                }
                j++;
            }
        }

        System.out.println("Not Found");
    }
}
