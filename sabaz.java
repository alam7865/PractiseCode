import java.util.*;
public class sabaz {
    public static void main(String[] args) {
        int nums[]={1,2,3};

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int max=-1;
            int count=0;
            while (num!=0) {
                int rem=num%10;
                if(rem>max)
                {
                    max=rem;
                }
                count++;
                num=num/10;
            }

            // System.out.println(count);
            int sum=0;
            while (count!=0) {
                
                sum=(sum*10)+max;
                count--;
            }

            nums[i]=sum;
            System.out.println(sum);
        }

        // System.out.println(1%10);
    }
}
