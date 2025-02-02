import java.util.*;
public class stock1 {
    public static void main(String[] args) {
        int[][] mat={
            {0,1,1,0},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,0},
        };

        int n=mat.length;
        int m=mat[0].length;
        int max=Integer.MIN_VALUE;

        // int arr[]=new int[m];

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(mat[i][j]==0)
        //         {
        //             arr[j]=0;
        //         }
        //         else{
        //             arr[j]+=mat[i][j];
        //         }

        //         // System.out.print(arr[j]+" ");
        //     }
        //     // System.out.println();

        //     max=Math.max(max,height(arr));
        // }

        // System.out.println("Result: "+max);


        ////////////////////////////
        int arr[]={0,1,1,0};
        int ans=height(arr);
        System.out.println(ans);
        
    }



    public static int height(int arr[])
    {
        int n=arr.length;

        // NSR and NSL
        int NSL[]=new int[n];
        int NSR[]=new int[n];
        int width[]=new int[n];
        int max=Integer.MIN_VALUE;
        Stack<Integer>st1=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while (!st1.isEmpty() && arr[st1.peek()]>=arr[i]) {
                st1.pop();
            }

            if(!st1.isEmpty() && arr[st1.peek()]<arr[i])
            {
                NSL[i]=st1.peek();
            }
            else{
                NSL[i]=-1;
            }

            st1.push(i);
        }

        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(NSL[i]+" ");
        // }


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
        //     System.out.print(NSR[i]+" ");
        // }

        
        for(int i=0;i<n;i++)
        {
            width[i]=((NSR[i]-NSL[i])-1)*arr[i];
        }

        for(int i=0;i<n;i++)
        {
            max=Math.max(max,width[i]);
        }


        return max;
    }
}
