import java.util.*;
public class cards {
    public static void main(String[] args) {
        int arr[]={17,13,11,2,3,5,7};
        Arrays.sort(arr);
        int n=arr.length;

        int arr1[]=new int[n];

        int x=0;
        for(int i=0;i<n;i++)
        {
            int idx=x%n;
            arr1[idx]=arr[i];
            x+=2;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
