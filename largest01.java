import java.util.*;
public class largest01 {
    public static void main(String[] args) {
        // int arr[]={0,0,1,0,0};
        int arr[]={0,1,0,1,0,1};
        int sum=0;
        int res=0;

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
           {
                sum-=1;
           }
           else{
                sum+=1;
           }

           System.out.println(sum);
           if(map.containsKey(sum))
           {
                int idx=i-map.get(sum);
                res=Math.max(res,idx);
           }
           else{
                map.put(sum,i);
           }
          
            
           
        }

        System.out.println();
        System.out.println();
        System.out.println(res);
        // System.out.println(res[0]+" "+res[1]);
    }
}
