import java.util.*;
public class height {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max,list.get(i));
        }

        System.out.println(max);
    }
}



/*
 


//User function Template for Java

class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        // Code here
        int l=0;
       int r=a.size()-1;
       while(l<r){
           int mid=(l+r)/2;
           if(a.get(mid)>a.get(mid+1)){
               r=mid;
           }
           else{
                l=mid+1;
           }
       }
       return a.get(l);
    }
}

 */