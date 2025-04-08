import java.util.*;

public class minOp {

    public static boolean isUnique(Queue<Integer> q) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : q) {
            set.add(i);
        }

        if (set.size() == q.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 9 };
        int n = arr.length;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        int count = 0;
        while (isUnique(q) != true) {
            if (q.size() <= 3) {
                count++;
                break;
            }
            count++;
            q.remove();
            q.remove();
            q.remove();
        }

        System.out.println(count);

    }
}
