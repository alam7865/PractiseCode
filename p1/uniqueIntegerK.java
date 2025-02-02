import java.util.*;
public class uniqueIntegerK {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int k=3;
        int arr[]={4,3,1,1,3,3,2};
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>sumArr=new ArrayList<>();
        int sum=0;
        int mapOne=0;
        int mapMore=0;

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>set:map.entrySet())
        {
            int key=set.getKey();
            int val=set.getValue();
           list.add(val);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
            sumArr.add(sum);
            // System.out.print(sumArr.get(i)+" ");
        }

        int count=0;
        int i=0;
        while (i<list.size()) {
            if(k>=list.get(i))
            {
                int x1=k;
                k-=sumArr.get(i);
                int x=sumArr.get(i);
                
                if(sumArr.get(i)-x1==0)
                {
                    count++;
                    i++;
                }

                if(k==0)
                {
                    break;
                }
            }
        }

        System.out.println(list.size()-i-1);
    }
}
