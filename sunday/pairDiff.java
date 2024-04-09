import java.util.*;
public class pairDiff {
    public static void main(String[] args) {
        // int arr[]={8, 12, 16, 4, 0, 20};
        // int k=4;
        // int count=0;
        // Arrays.sort(arr);

        // HashMap<Integer,Integer>set=new HashMap<>();

        // for(int i=0;i<arr.length;i++)
        // {
        //     int diff=Math.abs(k-arr[i]);
        //     if(set.containsKey(diff))
        //     {
        //         count++;
        //     }

        //     set.put(arr[i],set.getOrDefault(arr[i],0)+1);
        // }




        int a[]={1,2,4,10};
        int n=a.length;
        int k=3;
        HashMap<Integer,Integer>map=new HashMap<>();
        Arrays.sort(a);
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            int diff=(int)Math.abs(a[i]-k);
            if(map.containsKey(diff))
            {
                if(diff<k)
                {
                  count+=map.get(diff);  
                }
                
            }
            
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(count);
    }
}
