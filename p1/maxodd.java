import java.util.*;

public class maxodd {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder();
        // sb.append(1);
        // sb.append(2);

        // System.out.println(sb.toString());
        // char ch[]={'c','a','b','a','a','b','a','c'}
        PriorityQueue<Character> pq = new PriorityQueue<Character>();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            pq.add(ch[i]);
        }

        while (pq.size() > 2) {
            long x = pq.remove();
            long y = pq.remove();
            count++;
            long res = x * 2 + (y);
            pq.add(res);
        }

        System.out.println(count);
    }
}
