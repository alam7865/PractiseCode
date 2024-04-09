import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(10);
        int x=st.pop();
        st.push(30);

        System.out.println(st.size());
    }
}
