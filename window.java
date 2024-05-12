import java.util.*;
public class window {
    public static void main(String[] args) {
        int n=7;
        int k=4;
        int arr[]={1,2,1,3,4,2,3};
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();

        int i=0;

        while (k-->0) {
            set.add(arr[i]);
            i++;
        }

        list.add(set.size());
        int x=0;
        for(int j=i;j<n;j++)
        {
            if(set.contains(arr[x]))
            {
                set.remove(arr[x]);
                set.add(arr[i]);
            }
            x++;
            list.add(set.size());
        }

        for(int k1=0;k1<list.size();k1++)
        {
            System.out.print(list.get(k1)+" ");
        }
    }
}
