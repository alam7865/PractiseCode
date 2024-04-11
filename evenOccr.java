import java.util.*;

public class evenOccr {
    public static void main(String[] args) {
        int arr[] = { 9, 12, 23, 10, 12, 12,
                15, 23, 14, 12, 15 };

                Arrays.sort(arr);
                ArrayList<Integer,Integer>list=new ArrayList<>();
                LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();

                for(int i=0;i<arr.length;i++)
                {
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                }

                int count=0;
                for(Map.Entry<Integer,Integer>set:map.entrySet())
                {
                    int key=set.getKey();
                    int value=set.getValue();

                    if(value%2==0)
                    {
                        System.out.print(key+" ");
                        list.add(key);
                    }

                }
    }
}
