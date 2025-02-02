import java.util.*;
public class primeFactor {
    public static void main(String[] args) {
        int n=100;

        HashSet<Integer>set=new HashSet<>();
        // while (n>1) {
            
        //     for(int i=2;i>1;i++)
        //     {
        //         // if(n%i==0)
        //         // {
        //         //     // System.out.print(i+" ");
        //         //     set.add(i);
        //         //     n=n/i;
        //         //     i=i-1;
        //         // }
        //         // else{
        //         //     continue;
        //         // }
        //     }
        // }


        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                set.add(i);
            }
        }
        int len=set.size();
        
        int arr[]=new int[len];
        int x=0;
        for(int i:set)
        {
            arr[x]=i;
            System.out.print(arr[x]+" ");
            x++;
            
            // System.out.print(i+" ");
        }
    }
}
