import java.util.*;
public class checkRedandance {
    public static void main(String[] args) {
        String str="((a+b))";
        int n=str.length();


        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            boolean isPresent=true;

            if(ch==')')
            {
                while (st.peek()!='(' && !st.isEmpty()) {
                    if(st.peek()=='+' || st.peek()=='-' || st.peek()=='*' || st.peek()=='/')
                    {
                        isPresent=false;
                    }
                    st.pop();
                }

                st.pop();
                if(isPresent==false)
                {
                    System.out.println("YES Redandance");
                }
                
            }
            else{
                st.push(ch);
            }
        }

    }
}
