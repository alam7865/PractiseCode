import java.util.*;

public class stringGame {
    public static void main(String[] args) {
        String s = "aaab";
        int k = 2;

        int n = s.length();

        int arr[] = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int num = ch - 'a';
            arr[num]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : arr) {
            if (i != 0) {
                pq.add(i);
            }

        }

        while (k != 0) {
            int num = pq.poll();
            num -= 1;
            k = k - 1;
            if (num > 0) {
                pq.add(num);
            }
        }

        // System.out.println(pq.toString());

        for(int i=0;i<pq.size();i++)
        {
            System.out.println(pq.);
        }
    }
}