import java.util.*;
public class kmp {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String pat="geek";
        ArrayList<Integer>list=new ArrayList<>();
        int ans=0;
        int strLen=str.length();
        int patLen=pat.length();


        for(int i=0;i<strLen;i++)
        {
            if(str.charAt(i)==pat.charAt(0))
            {
                int ss=i;
                int k=i;
                int count=0;

                for(int j=0;j<patLen;j++)
                {
                    if(str.charAt(k)==pat.charAt(j))
                    {
                        count++;
                        // System.out.println(count);
                        k++;

                         if(count==patLen)
                        {
                            list.add(ss+1);
                            break;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
