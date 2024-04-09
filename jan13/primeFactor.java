import java.util.*;
public class primeFactor {

    public static void prime(int n)
    {
        TreeSet<Integer>set=new TreeSet<>();
        
        for(int i=2;i*i<=n;i++)
        {
            while (n%i==0) {
                set.add(i);
                n=n/i;
            }

        }

         if(n>1)
         {
            set.add(n);
         }  

         int arr[]=new int[set.size()];
         int x=0;
        for(Integer it:set)
        {
          arr[x++]=it; 
        }
    }
    public static void main(String[] args) {
        int n=100;
        prime(n);
    }
}
