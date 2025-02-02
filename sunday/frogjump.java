import java.util.*;

public class frogjump {
    public static void main(String[] args) {
        int n = 3;
        int leaves = 4;
        int frog[] = { 3, 2, 4 };
        // output: 1

        int arr[] = new int[leaves + 1];

        for (int i = 0; i < frog.length; i++) {
            int pos = frog[i];
            for (int j = pos; j < arr.length; j += pos) {
                arr[j] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i=0;i<N;i++)
        {
            int st=frogs[i];
            
            if(st<=leaves && !ans[st])
            {
                for(int j=st;j<=leaves;j=j+st)
                {
                    ans[j]=true;
                }
                
            }
        }
    }
}
