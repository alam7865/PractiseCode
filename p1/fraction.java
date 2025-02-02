import java.util.*;
public class fraction {
    public static void main(String[] args) {
        
        int arr[]={2,11,10,1,3};
        int k=10;
        int count=0;
        Arrays.sort(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        while (pq.size()>=2) {
            int x=pq.remove();
            int y=pq.remove();

            int ss=(Math.min(x,y)*2)+(Math.max(x,y));
            if(x>=k && y>=k)
            {
                break;
            }

            pq.add(ss);
            count++;
        }

        System.out.println(count);
    }
}
