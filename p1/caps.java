import java.util.*;
public class caps {
    public static void main(String[] args) {
        String str="aAbBcC";
        int count=0;
        String ss=str.toLowerCase();
        
        for(int i=0;i<str.length()-1;i++)
        {
            if(ss.charAt(i)!=ss.charAt(i+1))
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
