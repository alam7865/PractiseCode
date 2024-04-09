import java.util.*;
public class perimeter {
    public static void main(String args[])
    {
        int arr[]={1,12,1,2,5,50,3};
        int n=arr.length;
        Arrays.sort(arr);

        int arrsum[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            sum+=arr[i];
            arrsum[i]=sum;
        }


        for(int i=n-1;i>=0;i--)
        {
            if(arrsum[i]-arr[i]>arr[i])
            {
                System.out.println(arrsum[i]);
                break;
            }
        }
    }
}
