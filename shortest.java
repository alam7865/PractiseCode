import java.util.*;
public class shortest {
   public static void main(String[] args) {
   int nums[]={1,1,1,1};
   int sum=0;
   
   for(int i=0;i<nums.length;i++)
   {
     if(nums[i]==0)
     {
        sum-=1;
     }
     else{
        sum++;
     }
   }
   
   int ss=0;
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==0)
        {
            ss-=1;
        }
        else{
            ss+=1;
        }

        if(2*ss>sum)
        {
            System.out.println(i+1);
            break;
        }
    }
  
   }
}
