import java.util.*;
public class divisible8 {
    public static void main(String[] args) {
        // String str="16";
        String str="54141111648421214584416464555";
        int n=str.length();
        long sum=0;

        if(n<4)
        {
            int num=Integer.parseInt(str);
            if(num%2==0)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{

            String s=str.substring(n-3, n);
            int num=Integer.parseInt(s);
            if(num%2==0)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}
