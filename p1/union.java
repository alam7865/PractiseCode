import java.util.*;

public class union {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int i=0;
        int j=0;

        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();

        while (i<n && j<m) {
            if(arr1[i]==arr2[j])
            {
                set.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                set.add(arr1[i]);
                i++;
            }
            else{
                set.add(arr2[j]);
                j++;
            }
        }

        if(i<n)
        {
            while (i<n) {
                set.add(arr1[i]);
                i++;
            }
        }

        if(j<m)
        {
            while (j<m) {
                set.add(arr2[j]);
                j++;
            }
        }


        for(Integer element:set)
        {
            System.out.println(element);
        }
        return list;

    }

    public static void main(String[] args) {
        int arr1[] = { -8, -3, -3, -2, 0, 1, 2, 2, 6 };
        int arr2[] = { -9, -9, 0 };
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> list = findUnion(arr1, arr2, n, m);
        // System.out.println(list.size());
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
    }
}
