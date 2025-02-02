import java.util.*;
public class basketBall {
    public static void main(String[] args) {
        String arr[]={"5","-2","4","C","D","9","+","+"};

        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("C") || arr[i].equals("D") || arr[i].equals("+") )
            {
                if(arr[i].equals("C") )
                {
                    st.pop();
                }
                else if(arr[i].equals("D") )
                {
                    int num=st.peek();
                    st.push(num*2);
                }
                else{
                    int num1=st.pop();
                    int num2=st.pop();
                    int num3=num1+num2;
                    st.push(num2);
                    st.push(num1);
                    st.push(num3);
    
                }
            }
            else{
                int num=Integer.parseInt(arr[i]);
                st.push(num);
            }
        }

        while (!st.isEmpty()) {
            // System.out.println(st.pop());
            sum+=st.pop();
        }

        System.out.println(sum);
    }
}
