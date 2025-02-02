import java.util.*;
public class decodeStr {
    public static void main(String args[])
    {
        String str="1[b]";
        int n=str.length();

        Stack<String>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int currNum=0;
        String res="";
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);

            if(ch>='1' && ch<='9')
            {
                currNum=currNum*10+(ch-'0');
            }
            else if(ch=='[')
            {
                st.push(sb.toString());
                st.push(Integer.toString(currNum));
           
                sb=new StringBuilder();
                currNum=0;
            }
            else if(ch==']')
            {
                int num=Integer.parseInt(st.pop());
                String s=st.pop();
                
                sb=new StringBuilder(s+sb.toString().repeat(num));
                // res+=sb;
            }
            else{
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());


        // char c='9';
        // int num=c-'0';
        // System.out.println(num);

    }
}
