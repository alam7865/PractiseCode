import java.util.*;
public class range {
    public static void main(String[] args) {
       String s="123456789";
       int low=1000;
       int high=13000;
       ArrayList<Integer>list=new ArrayList<>();
       int n=s.length();


       for(int i=0;i<n;i++)
       {
            for(int j=i+1;j<=n;j++)
            {
                String str=s.substring(i,j);
                int num=Integer.parseInt(str);

                if(num>=low && num<=high)
                {
                    list.add(num);
                }
            }
       }

       Collections.sort(list); 
       for(int i=0;i<list.size();i++)
       {
            System.out.print(list.get(i)+" ");
       }
    }
}
