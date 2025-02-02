import java.util.*;
public class nextGreatestEle {
    public static int[] smallestLeft(int arr[],int n)
    {
        TreeSet<Integer>set=new TreeSet();

        for(int i=0;i<n;i++)
        {
            int numb=arr[i];
            if(set.lower(arr[i])==null)
            {
                arr[i]=-1;
            }
            else{
                arr[i]=set.lower(arr[i]);
            }

            set.add(numb);
        }

        return arr;

        
    }
    public static void main(String args[])
    {
        int arr[]={2, 3, 4, 5, 1};
        int n=arr.length;
        int res[]=smallestLeft(arr,n);
        // smallestLeft(arr,n);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
