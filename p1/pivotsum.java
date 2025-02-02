import java.util.*;

public class pivotsum {
    public static void main(String[] args) {
        // ArrayList<Integer>list=new ArrayList<>();
        LinkedList<Integer>list=new LinkedList<>();
        int arr[]={1,9,2,8,3,7};

        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
