import java.util.*;
public class ss {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        int x=15;
        Collections.sort(list1);
        list2.add(11);
        list2.add(12);
        list2.add(13);

        int count=0;
        for(int i=0;i<list2.size();i++)
        {
            int tar=x-list2.get(i);

            int low=0;
            int high=list1.size()-1;

            while (low<=high) {
                int mid=(low+high)/2;

                if(list1.get(mid)==tar)
                {
                    count++;
                    break;
                }
                else if(list1.get(mid)>tar)
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
        }

        System.out.println(count);
    }
}
