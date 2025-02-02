import java.util.*;
public class closeNum {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,3,5,5,7,8,9,12,12,13,14,16};
        int k=11;

        int ans1=0;
        int ans2=0;
        int low=0;
        int high=arr.length-1;

        int diff1=Integer.MAX_VALUE;
        int diff2=Integer.MIN_VALUE;

        // For lower term

        // while (low<=high) {
        //     int mid=(low+high)/2;

        //     if(arr[mid]==k)
        //     {
        //         System.out.println(arr[mid]);
        //         break;
        //     }
        //     else if(arr[mid]>k)
        //     {
        //         high=mid-1;
        //     }
        //     else{
        //         ans=arr[mid];
        //         low=mid+1;
        //     }
        // }

        // System.out.println(ans);


        // for Max Term
        
        // while(low<=high)
        // {
        //     int mid=(low+high)/2;

        //     if(arr[mid]==k)
        //     {
        //         ans=arr[mid];
        //         System.out.println(ans);
        //         break;
        //     }
        //     else if(arr[mid]>k)
        //     {
        //         ans=arr[mid];
        //         high=mid-1;
        //     }
        //     else{
        //         low=mid+1;
        //     }
        // }

        // System.out.println(ans);

        while (low<=high) {
            int mid=(low+high)/2;

            if(arr[mid]==k)
            {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>k)
            {
                diff1=arr[mid]-k;
                ans2=arr[mid];
                high=mid-1;
            }
            else{
                diff2=k-arr[mid];
                ans1=arr[mid];
                low=mid+1;
            }
        }

        // System.out.println(ans1);
        // System.out.println(ans2);

        if(diff1==diff2)
        {
            System.out.println("1");
            System.out.println(Math.max(ans1,ans2));
        }
        else if(ans1>ans2)
        {
            System.out.println("2");
            System.out.println(ans2);
        }
        else{
            System.out.println("3");
            System.out.println(ans1);
        }
    }
}
