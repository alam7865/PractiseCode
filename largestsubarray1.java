import java.util.*;
public class largestsubarray1 {
    public static void main(String[] args) {
        // int arr[]={15,-2,2,-8,1,7,10,23};
        // int n=8;

        // int len=0;
        // int maxlen=0;
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=arr[j];

        //         if(sum==0 && j-i+1>maxlen)
        //         {
        //             maxlen=j-i+1;
        //         }
        //     }
        // }

        // System.out.println(maxlen);



        //////////////////////////////////////////////////////////////////////

        // int[] A = {15, -2, 2, -8, 1, 7, 10, 23};
        // int maxLength = 0;

        // for (int i = 0; i < A.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < A.length; j++) {
        //         sum += A[j];
        //         if (sum == 0 && j - i + 1 > maxLength) {
        //             maxLength = j - i + 1;
        //         }
        //     }
        // }

        // System.out.println("Length of the largest subarray with sum 0: " + maxLength);




        ////////////////////////////////////////////////////////////////////////////

        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        int n=arr.length;
        int sum=0;
        int len=0;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];

            if(map.containsKey(sum))
            {
                int idx=i-map.get(sum);
                if(idx>len)
                {
                    len=idx;
                }
            }
            else{
                map.put(sum,i);
            }
        }

        System.out.println(len);
    }
}
