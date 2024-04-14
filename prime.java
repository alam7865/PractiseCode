import java.util.*;
public class prime {
    public static void main(String[] args) {
        int prime[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        ArrayList<Integer>list=new ArrayList<>();
 

        for(int i=0;i<prime.length;i++)
        {
            list.add(prime[i]);
        }

        int nums[]={2,2};
        int first=-1;
        int last=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            {
                if(first==-1)
                {
                    first=i;
                }
                else{
                    last=i;
                }
            }
        }


        if(last==-1)
        {
            last=first;
        }
        
        int diff=last-first;
        System.out.println(diff);
    }
}
