import java.util.*;
public class largestsubarray {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0};

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int res=0;


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum=sum-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum))
            {
                int idx=i-(map.get(sum));
                res=Math.max(idx,res);
            }
            else{
                map.put(sum,i);
            }
        }

        System.out.println("ANS: "+res);
    }
}
