import java.util.*;
public class divisible7 {
    public static void main(String[] args) {
        // String str="8955795758";
        String str="497";
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            int x=str.charAt(i)-'0';
            ans=((ans*10)+x)%7;
            System.out.print(ans+" ");
        }

        System.out.println("Hello");
    }
}
