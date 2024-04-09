import java.util.*;
public class binaryLinkedList {

    public static long pow(int x,int n)
    {
        long b=1;
        if(n==0)
        {
            return b;
        }
        long num=1;
        for(int i=1;i<=n;i++)
        {
            num*=2;
        }

        return num;
    }
    public static void main(String[] args) {
       int arr[]={0,1,1};
        // int arr[]={1,1,1,0};
        long mod=1000000000+7;
 	   long res=0;
       
       int n=arr.length-1;
       for(int i=0;i<arr.length;i++)
       {
            // res=(res+(arr[i]*(((int)Math.pow(2,(n-i)))%mod))%mod)%mod);
            // res+=(arr[i]*((int)Math.pow(2,n-i))))%mod;
            long num=pow(2,n-i);
            res+=((arr[i])*(num))%mod;
       }
       
       System.out.println(res);
    }
}
