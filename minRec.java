import java.util.*;
public class minRec {
    public static void main(String[] args) {
        int mat[][]={
            // {0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6},
            // {2,3},{1,2}
            {2,1},{1,0},{1,4},{1,8},{3,5},{4,6},
            // {0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6},
        };

        int r=mat.length;
        int c=mat[0].length;
        // System.out.println(r+" "+c);

        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<r;i++)
        {
            list.add(mat[i][0]);
            
        }

        Collections.sort(list);
        int minval=0;
        int w=1;

        int count=1;
        for(int i=0;i<list.size();i++)
        {
            int curr=list.get(i);

            if(curr-minval>w)
            {
                minval=curr;
                count++;
            }
        }

        System.out.println("Count: "+count);


        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.print(list.get(i)+" ");
        // }

        
    }
}
