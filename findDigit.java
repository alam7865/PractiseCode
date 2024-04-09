import java.util.*;
public class findDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            // int n=124;
        
        int n=sc.nextInt();
        int x=n;
        // int n=n;
        
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            
            if(x%rem==0)
            {
                count++;
            }
            n=n/10;
        }
        
        // return count;
        System.out.println(count);
        }
        
    }
}
