import java.util.*;
public class set {
    public static void main(String[] args) {
        int arr[]={3,2,2};
        int arr1[]=new int[2];
        int missing=0;
        int repeating=0;
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if( set.add(arr[i]))
            {
                set.add(arr[i]);
            }
            else{
                repeating=arr[i];
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(i+1))
            {
                missing=i+1;
            }
        }

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                repeating=arr[i];
            }
        }

        arr1[0]=repeating;
        arr1[1]=missing;

        for(int i=0;i<2;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
