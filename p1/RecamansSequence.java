import java.util.*;
public class RecamansSequence {
    public static void main(String[] args) {
        int n=5;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();

        list.add(0);
        for(int i=1;i<n;i++)
        {
            int prev=list.get(i-1);

            if(prev-i>0 && !list.contains(prev-i))
            {
                list.add(prev-i);
            }
            else{
                list.add(prev+i);
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
