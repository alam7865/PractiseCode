import java.util.*;
public class seven {
    public static void main(String[] args) {
        String s="bbbbiz";
        long count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                count++;
            }
        }
        
        // long ss= (long)(count*(float)((count+1)/2));
        long ss=(long)(4*(double)(2.5));
         long    sss  = (long)(count*(double)(count+1)/2);
        System.out.println(ss);
    }
}
