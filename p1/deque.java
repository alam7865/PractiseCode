import java.util.*;

public class deque {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int n = arr.length;
        int k = 3;

        // Comparator.reverseOrder()
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int index = 0;
        while (index < k) {

            while (!dq.isEmpty() && dq.peekLast() < arr[index]) {
                dq.removeLast();
            }
            dq.addLast(arr[index]);
            index++;
        }
        list.add(dq.peek());

        int idx = 0;
        for (int i = k; i < n; i++) {
            // remove
            if (dq.peek() == arr[i - k]) {
                dq.removeFirst();
            }

            // add

            while (!dq.isEmpty() && dq.peekLast() < arr[i]) {
                dq.removeLast();
            }
            dq.addLast(arr[i]);
            list.add(dq.peek());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
