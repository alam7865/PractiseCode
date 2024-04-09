import  java.util.*;
public class pairWithSum {
    public static void main(String args[])
    {
        int arr[]={1, 1, 1, 1};
        int k=2;
        int n=arr.length;
        int count=0;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(k-arr[i]))
            {
                count+=map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>set:map.entrySet())
        {
            int key=set.getKey();
            int val=set.getValue();
            System.out.println(key+" "+val);
        }

        System.out.println(count);
    }
}
