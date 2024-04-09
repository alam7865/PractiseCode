import java.util.*;
public class revseq {
    public static void main(String[] args) {
        int n=7;

        long mod=(long)1000000000+9;
        // int sum=1;
        int x=0;
        long res=0;
        for(int i=0;i<n;i++)
        {
            long sum1=1;
            for(int j=0;j<=i;j++)
            {
                x++;
                sum1*=x%mod;
                
            }
 
            res+=sum1;
        }

        System.out.println(res);
    }
}
