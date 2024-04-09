import java.util.*;
public class equal012 {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,0,1,0};
        HashMap<String,Integer>map=new HashMap<>();
        int ans=0;

        int c0=0;
        int c1=0;
        int c2=0;
        String key=(c1-c0)+ "#"+(c2-c1);
        map.put(key,1);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c0++;
            }
            else if(arr[i]==1)
            {
                c1++;
            }
            else{
                c2++;
            }

            key=(c1-c0)+"#"+(c2-c1);
            
            if(map.containsKey(key))
            {
                ans+=map.get(key);
                map.put(key,map.get(key)+1);
                System.out.println(key+"   "+map.get(key));
            }
            else{
                map.put(key,1);
                System.out.println(key+"    "+1);
            }  
        }
    }
}
