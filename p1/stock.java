import java.util.*;
public class stock {
    public static void main(String[] args) {
        // int arr[]={100,80,60,70,60,75,85};
        long arr[]={6,2,5,4,5,1,6};
        long n1=arr.length;
        int n=(int)n1;
        long NSL[]=new long[(int)n];
        long NSR[]=new long[(int)n];
        long width[]=new long[(int)n];
        long maxArea=Integer.MIN_VALUE;

        // NSL

        Stack<Integer>StNSL=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while (!StNSL.isEmpty() && arr[StNSL.peek()]>=arr[i]) {
                StNSL.pop();
            }

            if(StNSL.isEmpty())
            {
                NSL[i]=-1;
            }
            else{
                NSL[i]=StNSL.peek();
            }

            StNSL.push(i);
        }


        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(NSL[i]+" ");
        // }



        //NSR
        Stack<Integer>st2=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while (!st2.isEmpty() && arr[st2.peek()]>=arr[i]) {
                st2.pop();
            }

            if(st2.isEmpty())
            {
                NSR[i]=n;
            }
            else{
                NSR[i]=st2.peek();
            }

            st2.push(i);
        }


        // width

        for(int i=0;i<n;i++)
        {
            width[i]=(NSR[i]-NSL[i])-1;
            maxArea=Math.max(arr[i]*width[i],maxArea);
        }
       
        System.out.println(maxArea);
    }
}
