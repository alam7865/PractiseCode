import java.util.*;

public class ballonburst {
    public static void main(String[] args) {
        int[][] mat={
            // {10,16},{2,8},{1,6},{7,12},
            {-2147483646,-2147483645},{2147483646,2147483647}
        };

        Arrays.sort(mat, (a, b) -> a[1] - b[1]);

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        // int arrow=1;
        // int end=mat[0][1];

        // for(int i=1;i<mat.length;i++)
        // {
        //     if(mat[i][0]<end)
        //     {
        //         continue;
        //     }
        //     else{
        //          if(mat[i][0]>end)
        //          {
        //             arrow++;
        //             end=mat[i][1];
        //          }
        //     }
        // }

        // System.out.println(arrow);
    }
}
