import java.util.*;
public class stockStain {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        // LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();

        // for(int i=0;i<arr.length;i++)
        // {
        //     map.put(arr[i],i);
        // }

        // for(Map.Entry<Integer,Integer>set :map.entrySet())
        // {
        //     System.out.println(set.getKey()+" "+set.getValue());
        // }


        int n=arr.length;
       int res[]=new int[n];
       int idx[]=new int[n];

       Stack<Integer>st=new Stack<>();
      
       for(int i=0;i<n;i++)
       {
            if(st.isEmpty())
            {
                res[i]=-1;
                idx[i]=-1;
            }
            if(!st.isEmpty() && st.peek()>arr[i])
            {
                res[i]=st.peek();
                idx[i]=i;
            }
             if(!st.isEmpty() && st.peek()<=arr[i])
            {
                while (!st.isEmpty() && st.peek()<=arr[i]) 
                {
                   st.pop(); 
                }

                if(st.isEmpty())
                {
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }
            }

            st.push(arr[i]);
       }


       for(int i=0;i<n;i++)
       {
          System.out.print(res[i]+" ");
            // res[i]=i+res[i];
            // System.out.print(res[i]+" ");
       }
    }
}
