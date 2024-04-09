import java.util.*;
public class teckFast {

    public static long sumOfPowers(long n)
    {
        long count=0;

        for(int i=2;i*i<=n;i++)
        {
            while (n%i==0) {
                count++;
                n=n/i;
            }
        }

        if(n>1)
        {
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int a=9;
        int b=12;

        long sum=0;
        long result=0;

        for(int i=a;i<=b;i++)
        {
            result+=sumOfPowers(a);
        }
         
        System.out.println(result);
    }
}
