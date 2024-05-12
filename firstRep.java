import java.util.*;
public class firstRep {
    public static int slove(int arr[])
    {
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>1)
            {
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={10, 5, 3, 4, 3, 5, 6};
        int firstRepeating=slove(arr);
        System.out.println(firstRepeating);
    }
}
