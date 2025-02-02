import java.util.*;
public class primeFactor1 {
    public static void main(String[] args) {
        // int n=35;

       
        // int i=2;

        // while (i*i<=n) {
        //     while (n%i==0) {
        //        System.out.println(i);
        //        n=n/i;
        //     }
        //     i++;
        // }

        // if(n>1)
        // {
        //     System.out.println(n);
        // }


        // int n=10;

        // int i=2;
        // while (i*i<=n) {
        //     while (n%i==0) {
        //         System.out.print(i+" ");
        //         n=n/i;
        //     }
        //     i++;
        // }

        // if(n>1)
        // {
        //     System.out.print(n);
        // }


        ///===================== Leetcode ===============================
        // int nums[]={2,14,19,19,5,13,18,10,15,20};

        // int n=1;

        // for(int i=0;i<nums.length;i++)
        // {
        //     n=n*nums[i];
        //     System.out.println(n);
        // }
        // System.out.println();
        // System.out.println(n);


        //=========================
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        int n=1119341632;

        int i=2;

        while (i*i<=n) {
            while (n%i==0) {
               if(set.add(i))
               {
                   list.add(i);
                   System.out.println(i);
               }
               n=n/i;
            }
            i++;
        }

        if(n>1)
        {
             if(set.add(n))
               {
                   list.add(n);
                   System.out.println(n);
               }
        }
    }
}
