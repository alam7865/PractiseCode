import java.util.*;

public class levelTrav {
    public static void main(String[] args) {
        int newInterval[]={2,5};
        int intervals[][]={
            {1,3},{6,9}
        };

        ArrayList<int[]>result=new ArrayList<>();
        int mat[]={0,0};
        for(int[] in:intervals)
        {
            if(in[1]<newInterval[0])
            {
                result.add(in);
            }
            else if(newInterval[1]<in[0]){
                result.add(newInterval);
                newInterval=in;
                mat[0]=newInterval[0];
                mat[1]=newInterval[1];
                System.out.println(mat[0]+" "+mat[1]);
            }
            else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                newInterval[1]=Math.min(newInterval[1],in[1]);
                mat[0]=newInterval[0];
                mat[1]=newInterval[1];
                System.out.println(mat[0]+" "+mat[1]);
               
            }
        }
        result.add(newInterval);
    }
}
