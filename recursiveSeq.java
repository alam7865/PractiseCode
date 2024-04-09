import java.util.*;
public class recursiveSeq {
    public static void main(String[] args) {
        int n=11;
        long mod=1000000000+7;
        long sum=0;
        long res=1;
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                // System.out.print('*'+" ");
                sum*=x;
                sum=sum%mod;
                x++;
            }
            res+=(sum);
            sum=1;
            // System.out.println(res);
            // System.out.println();
        }

        System.out.println(res%mod);
    }
}
