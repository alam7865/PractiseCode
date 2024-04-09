import java.util.*;
public class highestNum {
    public static void main(String args[])
    {
        // int arr[]={1,2,3,4,5,6,5,4,3,2,1};
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int res=Integer.MIN_VALUE;

        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                // res=arr[i-1];
                res=Math.max(res,arr[i-1]);
            }
        }

        if(res==Integer.MIN_VALUE)
        {
            System.out.println(arr[n-1]);
        }
        else{
            System.out.println(res);
        }
        
    }
}
