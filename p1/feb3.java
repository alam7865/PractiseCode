import java.util.*;
public class feb3 {
    public static void main(String[] args) {
        // nums = [-1,3,2,4,5] k = 3
        int nums[]={-1,3,2,4,5};
        int k=3;
        long max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff==k)
                {
                    count++;
                    max=Math.max(nums[i]+nums[j],max);
                    // System.out.println(nums[i]+" "+nums[j]);
                    // System.out.println();
                }
            }
        }

        // System.out.println(count);
        System.out.println(max);
    }
}
