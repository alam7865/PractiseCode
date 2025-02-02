import java.util.*;
public class contest {
    public static void main(String[] args) {
        int ask[]=new int [26];

        int k=97;
        for(int i=0;i<26;i++)
        {
            ask[i]=k;
            k++;
        }

        // String str="hello";
        String str="zaz";
        

        int n1=str.length();

        int arr[]=new int[n1];

        for(int i=0;i<n1;i++)
        {
            char ch=str.charAt(i);
            int idx=ch-'a';
            arr[i]=ask[idx];
        }

        int ans=0;

        for(int i=1;i<n1;i++)
        {
            int ss=Math.abs(arr[i]-arr[i-1]);
            ans+=ss;
        }

        System.out.println(ans);
    }
}
