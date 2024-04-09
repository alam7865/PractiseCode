import java.util.*;
public class atoi {
   public static void main(String[] args) {
        String str="124";
        int n=str.length();
        boolean isNegative=false;
        int res=0;


        
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);

            if(ch=='-' && i==0)
            {
                isNegative=true;
            }
            else if(ch>='1' && ch<='9')
            {
                res=res*10+(ch-'0');
            }
            else{
                return false;
            }
        }

        
   } 
}
