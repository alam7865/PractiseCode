import java.util.*;
public class factor {
    public static void main(String[] args) {
        int n=5;
        int count=0;

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n/i==i)
            {
                count++;
            }
            else if(n%i==0)
            {
               count+=2;
            }
        }

        // System.out.println(Math.sqrt(5));
        System.out.println(count);
    }
}
