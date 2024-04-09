import java.util.*;
public class easyString {
    public static void main(String[] args) {
        String str="aaabbbb";
        int n=str.length();
        String res="";
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else{
                count++;
                String s=Integer.toString(count);
                res+=res+s+str.charAt(i);
                count=0;
            }
        }

        System.out.println(res);
    }
}
