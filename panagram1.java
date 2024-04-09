import java.util.*;
public class panagram1 {
    public static void main(String args[])
    {
        String s="Bawds jog, flick quartz, vex nymph";
        String str=s.toLowerCase();
        int n=str.length();

        int arr[]=new int[26];

        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);

            if(ch==' ' || ch==',')
            {
               
            }
            else{
                arr[ch-'a']++;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
