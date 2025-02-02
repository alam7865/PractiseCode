import java.util.*;
public class panagram {
    public static void main(String[] args) {
        String s= "Bawds jog, flick quartz, vex nymph";

        String sentence=s.toLowerCase();
        int n=s.length();

 


        int arr[]=new int[26];

        for(int i=0;i<n;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==',' || ch==' ')
            {
                continue;
            }
            int idx=ch-'a';
            arr[idx]++;
        }

        int count=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                count++;
            }
        }

        System.out.println(count);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       





        // String sentence=str.toLowerCase();
        // System.out.println(sentence);
        // int n=sentence.length();
        
        // System.out.println(sentence.charAt(9));
        // int arr[]=new int[26];

        // for(int i=0;i<n;i++)
        // {
        //     char ch=sentence.charAt(i);
        //     if(ch==',')
        //     {
        //         continue;
        //     }
        //     int idx=ch-'a';
        //     arr[idx]++;
        // }

        // // int count=0;
        // // for(int i=0;i<26;i++)
        // // {
        // //     if(arr[i]>0)
        // //     {
        // //         count++;
        // //     }
        // // }
        // // System.out.println(count);
        
    }
}
