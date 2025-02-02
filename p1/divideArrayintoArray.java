import java.util.*;
public class divideArrayintoArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,8,7,9,3,5,1};
        int k=2;
        Arrays.sort(arr);
        
        int n=arr.length;
        int len=n/3;
        int mat[][]=new int[len][len];
        for(int i=0;i<n;i+=3)
        {
            int last=i+2;
            if(arr[last]-arr[i]<=k)
            {
                System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
                System.out.println();
            }
            else{
                System.out.println(mat);
            }
        }
    }
}
