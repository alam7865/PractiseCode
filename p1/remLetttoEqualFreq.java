import java.util.*;

public class remLetttoEqualFreq {

    public static boolean equalCount(int arr[], int freq) {
        // int freq=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
               if(arr[i]!=freq)
                {
                return false;
                } 
            }
            
        }

        return true;
    }

    public static void main(String[] args) {
        // HashMap<Character,Integer>map=new HashMap<>();

        int arr[] = new int[26];
        String str = "xyz";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            arr[idx]++;
        }

        // for(int i=0;i<26;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            arr[idx]--;
            int freq = arr[idx];
            // System.out.println("FF: "+freq);
            if (equalCount(arr, freq)) {
                // return true;
                // return true;
                System.out.println("True1: ");
                break;
            }

            arr[idx]++;
        }

        System.out.println("False1: ");
    }
}
