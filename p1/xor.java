import java.util.*;
public class xor {
    public static void main(String[] args) {
       String s="11101000111";

       int even=0;
       int odd=0;

       for(int i=0;i<s.length();i++)
       {
            int idx=s.charAt(i)-'0';
            if(i%2==0)
            {
                even+=idx;
            }
            else{
                odd+=idx;
            }
       }

       System.out.println(even+" "+odd);
    //    int diff=even-odd;
    //    if(diff%11==0)
    //    {
    //         System.out.println("1");
    //    }
    //    else{
    //     System.out.println("0");
    //    }
    }
}
