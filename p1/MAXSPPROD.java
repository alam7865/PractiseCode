import java.util.*;
public class MAXSPPROD {
    public static void main(String[] args) {
        int arr[]={ 1950, 9417, 7760, 1939, 8551, 5184, 2187, 1097, 9686, 525, 7923, 364, 9182, 3013, 3252, 2203, 5496, 1537, 3455, 2209, 6981, 8032, 831, 2096, 6715, 3113, 2137, 9938, 2010, 5686, 2920, 4382, 9611, 9909, 1610 };

        // int n=arr.length;
        // int NGL[]=new int[n];
        // int NGR[]=new int[n];
        // Long max=Long.MIN_VALUE;


        // //NGL
        // Stack<Integer>st1=new Stack<>();

        // for(int i=0;i<n;i++)
        // {
        //     while(!st1.isEmpty() && arr[st1.peek()]<=arr[i])
        //     {
        //         st1.pop();
        //     }

        //     if(!st1.isEmpty() && arr[st1.peek()]>arr[i])
        //     {
        //         NGL[i]=st1.peek();
        //     }
        //     else{
        //         NGL[i]=0;
        //     }

        //     st1.push(i);
        // }

        
        // //NGR
        // Stack<Integer>st2=new Stack<>();

        // for(int i=n-1;i>=0;i--)
        // {
        //     while (!st2.isEmpty() && arr[st2.peek()]<=arr[i]) 
        //     {
        //         st2.pop();
        //     }

        //     if(!st2.isEmpty() && arr[st1.peek()]>arr[i])
        //     {
        //         NGR[i]=st2.peek();
        //     }
        //     else{
        //         NGR[i]=0;
        //     }

        //     st2.push(i);
        // }

        // for(int i=0;i<n;i++)
        // {
        //     long pp=(NGL[i]*NGR[i]);
        //     max=Math.max(max,pp);
        // }

        // System.out.println(max);




        int n=arr.length;
        int NGL[]=new int[n];
        int NGR[]=new int[n];
        long max=Long.MIN_VALUE;


        //NGL
        Stack<Integer>st1=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!st1.isEmpty() && arr[st1.peek()]<=arr[i])
            {
                st1.pop();
            }

            if(!st1.isEmpty() && arr[st1.peek()]>arr[i])
            {
                NGL[i]=st1.peek();
            }
            else{
                NGL[i]=0;
            }

            st1.push(i);
        }

        
        //NGR
        Stack<Integer>st2=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while (!st2.isEmpty() && arr[st2.peek()]<=arr[i]) 
            {
                st2.pop();
            }

            if(!st2.isEmpty() && arr[st1.peek()]>arr[i])
            {
                NGR[i]=st2.peek();
            }
            else{
                NGR[i]=0;
            }

            st2.push(i);
        }

        for(int i=0;i<n;i++)
        {
            int pp=(NGL[i]*NGR[i]);
            max=Math.max(max,pp);
        }
        
        long mod=(1000000000+7);
        // return (int)(max%mod);

        System.out.println(max);
    }
}
