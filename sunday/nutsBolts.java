import java.util.*;

public class nutsBolts {
    public static void main(String[] args) {

        char nuts[] = { '@', '%', '$', '#', '^' };
        char bolts[] = { '%', '@', '#', '$', '^' };
        String str = "!#$%&*@^~.";
        int p = 0;
        int n=nuts.length;

        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nuts[j]==str.charAt(i))
                {
                    char temp=nuts[j];
                    nuts[j]=nuts[p];
                    nuts[p]=temp;
                    bolts[p]=nuts[p];
                    p++;
                    if(p>n-1)
                    {
                        break;
                    }
                }

            }

        }

        for(int i=0;i<n;i++)
        {
            System.out.print(bolts[i]+" ");
        }
    }
}
