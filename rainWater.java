import java.util.*;
public class rainWater {
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        int n=arr.length;
        int maxL[]=new int[n];
        int maxR[]=new int[n];
        int min[]=new int[n];
        maxL[0]=arr[0];
        maxR[n-1]=arr[n-1];
        int maxSum=0;


        for(int i=1;i<n;i++)
        {
            maxL[i]=Math.max(maxL[i-1],arr[i]);
        }


        for(int i=n-2;i>=0;i--)
        {
            maxR[i]=Math.max(maxR[i+1],arr[i]);
        }

        
        for(int i=0;i<n;i++)
        {
            min[i]=Math.min(maxL[i],maxR[i]);
            System.out.print(min[i]+" ");
            maxSum+=min[i]-arr[i];
        }

        System.out.println(maxSum);
    }
}
