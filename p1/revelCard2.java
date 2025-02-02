import java.util.*;

public class revelCard2 {
    public static void main(String args[]) {
        int deck[] = { 17, 13, 11, 2, 3, 5, 7 };

        Arrays.sort(deck);
        int n=deck.length;
        int arr[]=new int[n];
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<deck.length;i++)
        {
            q.add(i);
        }

        int i=0;
        while (i<n) {
            int idx=q.remove();
            int y=-1;
            if(!q.isEmpty())
            {
                y=q.remove();
                q.add(y);
            }

            arr[idx]=deck[i];
            i++;
        }
        

        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
