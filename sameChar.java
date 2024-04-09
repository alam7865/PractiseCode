import java.util.*;
public class sameChar {
    public static void main(String[] args) {
        String str="aaaaaa";  // 7
        // int count=0;
        // int n=str.length();

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<=n;j++)
        //     {
        //         String Str1=str.substring(i, j);
        //         char first=Str1.charAt(0);
        //         char last=Str1.charAt(Str1.length()-1);

        //         if(first==last)
        //         {
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);


        int arr[]=new int[26];
        
        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i)-'a';
            arr[ch]++;
        }

         int count=0;
        for(int i=0;i<26;i++)
        {
             if(arr[i]-1>0)
             {
                   int num=arr[i]-1;
                 count+=num;
             }
        }

        count+=str.length();

        System.out.println(count);


        // for(int i=0;i<26;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }
}
