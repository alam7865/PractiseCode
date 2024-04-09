import java.util.*;
public class teckFast {

    public static long power(long n)
    {
        long sum=0;
        HashMap<Long,Long>map=new HashMap<>();
        for(long i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                sum++;
                map.put(i,map.getOrDefault(i,(long)0)+1);
                n=n/i;
            }

        }

        if(n>1)
        {
            sum++;
            map.put(n,map.getOrDefault(n,(long)0)+1);
            // map.put(1,map.getOrDefault(1, 0)+1);
        }


        // for(Long it:map.values())
        // {
        //     // System.out.println(it);
        //     sum+=it;
        // }

        return sum;
    }
    public static void main(String[] args) {
        long a=9;
        long b=12;

        long sum=0;

        for(long i=a;i<=b;i++)
        {
            sum+=power(i);
        }

        System.out.println(sum);
    }
}


/*
 

//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        
        int n=s.length();
        
        int[] lps=new int[n];
        
        int i=0;
        int j=1;
        lps[0]=0;
        
        while(j<n)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                lps[j]=i+1;
                i++;
                j++;
            }
            else{
                if(i==0)
                {
                    lps[j]=0;
                    j++;
                }
                else{
                    i=lps[i-1];
                }
            }
        }
        
        return lps[n-1];
    }
}
 */
