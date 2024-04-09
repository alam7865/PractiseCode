import java.util.*;
public class closestNum {
    public static void main(String[] args)
    {
        // // int arr[]={1,2,3,5,6,8,9};
        // int arr[]={0,1,1,2,2,3,3,3,5,5,7,8,9,10,10,13,14,14,16,16};
        // int k=7;
        // // int k=4;



        // int arr[]={3,12,14,15,17};
        // int k=19;

        int arr[]={5,9,12,16};
        int k=2;
        int ans1=0;
        int ans2=0;
        // int 

        // // For Lower Term

        int low=0;
        int high=arr.length-1;

        while (low<=high ) {
            int mid=(low+high)/2;

            if(arr[mid]==k)
            {
                System.out.println("Found "+arr[mid]);
                break;
            }
            else if(arr[mid]<k)
            {
                ans1=arr[mid];
                low=mid+1;
            }
            else{
                ans2=arr[mid];
                high=mid-1;
            }
        }

        System.out.println(ans1);
        System.out.println(ans2);




        // // For Higher Term

        // int low1=0;
        // int high1=arr.length;

        // while (low1<=high1) {
        //     int mid1=(low1+high1)/2;

        //     if(arr[mid1]==k)
        //     {
        //         ans2=arr[mid1];
        //         low1=mid1+1;
        //     }
        //     else if(arr[mid1]>k)
        //     {
        //         ans2=arr[mid1];
        //         high1=mid1-1;
        //     }
        //     else{
                
        //         low1=mid1+1;
        //     }
        // }

        // System.out.println(ans2);


        // if(Math.abs(ans1-k)==Math.abs(ans2-k))
        // {
        //     System.out.println(Math.max(ans1,ans2));
        // }
        // else if(Math.abs(ans1-k)>Math.abs(ans2-k))
        // {
        //     System.out.println(ans2);
        // }
        // else{
        //     System.out.println(ans1);
        // }



        //===================================  ===============================

        // int arr[]={1,3,6,7};
        // int k=4;

        // int low=0;
        // int high=arr.length-1;
    }
}
