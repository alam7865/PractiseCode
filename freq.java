import java.util.*;
public class freq {
    public static void main(String[] args) {
        int nums[]={1,2,2,3,1,4};


        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }

            if(max<map.get(nums[i]))
            {
                max=map.get(nums[i]);
            }
            
        }
        // System.out.println("Max: "+max);
        for(int i=0;i<n;i++)
        {
            int value=map.get(nums[i]);
            if(value==max)
            {
                count+=max;
            }
        }

        // return count;

        for(Map.Entry<Integer,Integer>set:map.entrySet())
        {
            System.out.println(set.getKey()+" "+set.getValue());
        }
    }
}
