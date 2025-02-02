import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        int peakIdx=0;
        int max1=Integer.MIN_VALUE;

        int arr[]={1, 1, 1, 2, 1, 1, 1};
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max1=arr[i];
                peakIdx=i;
            }
        }

        System.out.println(max1);
        System.out.println(peakIdx);
    }
}





/*Complete the function below*/

// class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here. 
       int left = 0, right = n - 1; 
       
       while(left <= right)
       {
           int mid = (left + right) >> 1; 
           
           if(left < mid && arr[mid] < arr[mid - 1])
           {
               right = mid - 1;
           } 
           else if(mid < right && arr[mid] < arr[mid + 1])
           {
               left = mid + 1;
           } 
           else
           {
               return mid;
           }
       } 
       return -1;
    }
}