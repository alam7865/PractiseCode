import java.util.*;

public class code {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // // int x=sc.nextInt();

        // int ans=0;
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++)
        // {
        // int x=sc.nextInt();
        // int pcount=0;
        // if(x<2)
        // {
        // pcount++;
        // }
        // else{
        // pcount+=x/2;
        // }
        // ans+=pcount;
        // }

        // System.out.println(ans);

        // int ans = 0;
        // Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();

        // while (t-- > 0) {
        //     int n = sc.nextInt();
        //     // int pcount = 0;
        //     ans = 0;
        //     for (int i = 0; i < n; i++) {
        //         int pcount = 0;
        //         int x = sc.nextInt();
        //         if (x % 2 != 0) {
        //             int que = (x / 2) + 1;
        //             pcount += que;
        //             ans += pcount;
        //         } else {
        //             int que = x / 2;
        //             pcount += que;
        //             ans += pcount;
        //         }

        //     }

        //     System.out.println(ans);

        // }


        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int sum=0;
            for(int i=1;i<n;i++)
            {
                sum+=arr[i-1]+arr[i];
            }
            System.out.println(sum);
        }

    }
}
