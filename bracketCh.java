import java.util.*;
public class bracketCh {
    public static void main(String[] args) {
        String str="{}{(}))}";
        int n=str.length();

        Stack<Character>st=new Stack<>();

        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);

            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else{
                if(st.peek()=='{' && ch=='}')
                {

                        st.pop();
                }
                else if(st.peek()=='[' && ch==']')
                {
                        st.pop();
                } 
                else if(st.peek()=='(' && ch==')')
                {
                        st.pop();
                }
                else{
                    System.out.println("Not Valid");
                    break;
                }
            }
        }

        if(st.isEmpty())
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
       
    }
}



// {}{(}))}