import java.util.*;

public class parityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        pQueue.add(4);
        pQueue.add(3);
        pQueue.add(2);
        pQueue.add(6);
        int ans = 0;
        int ans1 = 0;
        // System.out.println(pQueue.toString());

        while (!pQueue.isEmpty()) {
            int num1 = pQueue.poll();
            int num2 = pQueue.poll();
            System.out.println(num1 + " " + num2);
            ans += num1 + num2;

            ans1 += ans;

            if (pQueue.isEmpty()) {
                break;
            }
            pQueue.add(ans);
            ans = 0;
        }

        System.out.println(ans1);
    }
}
