import java.util.*;
public class continious {
    public static void main(String[] args) {
        int nums[]={0,1,0};
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        int max=-1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                sum-=1;
            }
            else{
                sum+=nums[i];
            }
            if(map.containsKey(sum))
            {
                int val=map.get(sum);
                int idx=i-(val);

                if(idx>max)
                {
                    max=idx;
                }
            }
            else{
                map.put(sum,i);
            }
        }

        for(Map.Entry<Integer,Integer>set:map.entrySet())
        {
            System.out.print(set.getKey()+" "+set.getValue());
            System.out.println();
        }
    }
}
