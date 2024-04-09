import java.util.*;
public class diffk {
    public static void main(String[] args) {
        // int arr[]={ 11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13 };
        
        int arr[]={1,5,7,1};

        HashMap<Integer,Integer>map=new HashMap<>();

        // for(int i=0;i<arr.length;i++)
        // {
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer>set:map.entrySet())
        {
            int key=set.getKey();
            int val=set.getValue();

            System.out.println(key+" "+val);
        }
    }
}
