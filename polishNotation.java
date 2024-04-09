import java.util.*;
public class polishNotation {
    public static void main(String[] args) {
        // String tokens[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String tokens[]={"2","1","+","3","*"};
        int n=tokens.length;
        Stack<Integer>st=new Stack<>();


        for(int i=0;i<n;i++)
        {
            String str=tokens[i];
            if(str.equals("*") || str.equals("+") || str.equals("/") || str.equals("-"))
            {
                int a=st.pop();
                int b=st.pop();

                if(str.equals("*"))
                {
                    int num=a*b;
                    st.push(num);
                }
                else if(str.equals("+"))
                {
                    int num=a+b;
                    st.push(num);
                }
                else if(str.equals("/"))
                {
                    int num=a/b;
                    st.push(num);
                }
                else if(str.equals("-"))
                {
                    int num=a-b;
                    st.push(num);
                }
            }
            else{
                int number=Integer.parseInt(tokens[i]);
                st.push(number);
            }
        }

        if(st.isEmpty())
        {
            System.out.println("Result: "+ -1);
        }
        else{
            System.out.println(st.pop());
        }
    }
}
