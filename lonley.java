import java.util.*;
public class lonley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // Consume newline character after nextInt()

        while (t-- > 0) {
            String str = sc.next(); // Use next() instead of nextLine()
            String x = str.substring(0, 2);
            String y = str.substring(3, 5);

        String period=" AM";

        int x1=Integer.parseInt(x);
        if(x1>=1 && x1<=11)
        {
            period=" AM";
            
           

            int count=0;
            int numsd=x1;
            while (x1!=0) {
                int rem=x1%10;
                count++;
                x1=x1/10;
            }

            String num1=Integer.toString(numsd);
            if(count==1)
            {
                num1="0"+num1;
            }

            String ans2=num1+":"+y+period;
            System.out.println(ans2);

        }
        else if(x1==12)
        {
            String ss=x1+":"+y+" PM";
            System.out.println(ss);
        }
        else if(x.equals("00"))
        {
            String ss=12+":"+y+" AM";
            System.out.println(ss);
        }
        else{
            period=" PM";
            int  nums=(int)Math.abs(x1-12);
            int numss=nums;
            int count=0;
            while (nums!=0) {
                int rem=nums%10;
                count++;
                nums=nums/10;
            }

            String num1=Integer.toString(numss);
            if(count==1)
            {
                num1="0"+num1;
            }

            String ans2=num1+":"+y+period;
            System.out.println(ans2);

            int x=Math.pow(numss, count)
        }
    }
}
}
