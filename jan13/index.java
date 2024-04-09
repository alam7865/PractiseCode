import java.util.*;
public class index {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle ="sad";
        
        int hayLen=haystack.length();
        int needleLen=needle.length();

        for(int i=0;i<hayLen-needleLen+1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.substring(i, i+needleLen).equals(needle))
                {
                    System.out.println(i);
                    
                }
            }
        }

        System.out.println("REturn :");
    }
}
