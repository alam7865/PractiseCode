import java.util.*;
public class lcp {
    public static void main(String[] args) {
        String arr[]={"geeksforgeeks","geeks","geek","geezer"};
        int n=arr.length;

        String str="";
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(min>arr[i].length())
            {
                str=arr[i];
                min=arr[i].length();
            }
        }

        StringBuilder sb=new StringBuilder();
        boolean IsEqual=true;
        for(int i=0;i<min;i++)
        {
            char ch=str.charAt(i);
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].charAt(i)!=ch)
                {
                    if(sb.length()==0)
                    {
                        System.out.println("-1");
                    }
                    else{
                        System.out.println(sb.toString());
                    }

                    IsEqual=false;
                    break;
                }
            }

            if(IsEqual==false)
            {
                break;
            }

            sb.append(ch);
        }

       
        // System.out.println(IsEqual);
    }
}
