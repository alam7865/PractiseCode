import java.util.*;
public class firstRepeat {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]={2,2,1,1,1,2,2};
        int appear=arr.length/2;
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

        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>appear)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
