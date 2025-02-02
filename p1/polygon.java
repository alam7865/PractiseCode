import java.util.*;

public class polygon {
    public static void main(String[] args) {
        int arr[]={1,12,1,2,5,50,3};
        int n=arr.length;
        Arrays.sort(arr);

        long sumarr[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            sumarr[i]=sum;
        }

        for(int i=n-1;i>=0;i--)
        {
            if(sumarr[i]-arr[i]>arr[i])
            {
                System.out.println(sumarr[i]);
                break;
            }
            else if(i<=1)
            {
                break;
            }
        }
    }
}
