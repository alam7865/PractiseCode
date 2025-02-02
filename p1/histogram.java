import java.util.*;
public class histogram {
    public static void main(String args[])
    {
        int arr[]={6,2,5,4,5,1,6};
        int n=arr.length;

        int NSL[]=new int[n];
        int NSR[]=new int[n];
        int width[]=new int[n];
        int max=Integer.MIN_VALUE;


        // NSL

        Stack<Integer>st1=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i])
            {
                st1.pop();
            }

            if(!st1.isEmpty() && arr[st1.peek()]<arr[i])
            {
                NSL[i]=st1.peek();
            }
            else{
                NSL[i]=0;
            }

            st1.push(i);
        }



        // NSR

        Stack<Integer>st2=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i])
            {
                st2.pop();
            }

            if(!st2.isEmpty() && arr[st2.peek()]<arr[i])
            {
                NSR[i]=st2.peek();
            }
            else{
                NSR[i]=n;
            }

            st2.push(i);
        }


        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(NSL[i]+" ");
        // }
        for(int i=0;i<n;i++)
        {
            width[i]=((NSR[i]-NSL[i])-1);
            max=Math.max(max,width[i]*arr[i]);
        }

        System.out.println("Res: "+max);
    }
}
