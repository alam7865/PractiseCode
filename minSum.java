import java.util.*;
public class minSum{

    public static String solve(int arr[])
    {
        int n=arr.length;
        long ans1=0;
        long ans2=0;

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ans1=ans1*10+arr[i];
            }
            else{
                ans2=ans2*10+arr[i];
            }
        }
        
        long ans=ans1+ans2;

        String aa=String.valueOf(ans);
        System.out.println(aa);
        return "sabaz";
    }
    public static void main(String[] args) {
        int arr[]={5, 3, 0, 7, 4};
        int n=arr.length;
        Arrays.sort(arr);
        String result=solve(arr);
        System.out.println("Result: "+result);
    }
}