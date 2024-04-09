import java.util.*;
public class apple {
    public static void main(String[] args) {
        // happiness = [1,2,3], k = 2
        String str="aaa";
        HashSet<Character>set=new HashSet<>();
        set.add('c');
        if(set.add(str.charAt(0)))
        {
            
        }
        if(set.add(str.chatAt(i)))
           {
                sb.append(str.charAt(i));
           }
        int happiness[]={12,1,42};
        int k=3;
        Arrays.sort(happiness);
        
        int n=happiness.length;
        
        long sum=0;
        

        int x=0;
        for(int i=n-1;i>=0;i--)
        {
            if(k==0)
            {
                break;
            }
            k--;
            if(happiness[i]-x<0)
            {
                continue;
            }
            sum+=(happiness[i]-x);
            System.out.print(sum+" ");
            x++;
        }

      
        System.out.println("kk "+k);
        // return sum;
        System.out.println(sum);
    }
}
