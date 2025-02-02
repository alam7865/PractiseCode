import java.util.*;
public class uniqueChar {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        String str="leetcode";
        
        int arr[]=new int[26];
        // char c='a';
        // int num=c-'a';
        // System.out.println(num);

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int idx=c-'a';
            arr[idx]++;
        }
        

        int res=Integer.MIN_VALUE;

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int idx=c-'a';
            if(arr[idx]==1)
            {
                res=i;
                System.out.println("Result: "+res);
                break;
            }
        }
    }
}
