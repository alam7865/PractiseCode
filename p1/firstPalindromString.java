import java.util.*;
public class firstPalindromString {

    public static boolean checkPal(String str)
    {
       
        int count=str.length();
        int count1=0;
        int low=0;
        int high=str.length()-1;

        while (low<high) {
            if(str.charAt(low)==str.charAt(high))
            {
                low++;
                high--;
                count1++;
            }
            else{
                return false;
                // continue;
            }  
        }
        
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"abc","car","ada","racecar","cool"};
        int n=words.length;

        for(int i=0;i<words.length;i++)
        {
            boolean ans=checkPal(words[i]);
            System.out.println(ans);
        }
    }
}
