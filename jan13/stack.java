import java.util.*;

public class stack {
    public static void main(String[] args) {
        String x = "{}{(}))}";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println("false1");
                }
            } else {
                char top = st.peek();
                if (ch == ')' || ch == '}' || ch == ']') {
                    if (ch == ')' && top == '(') {
                        st.pop();
                    }

                    if (ch == '}' && top == '{') {
                        st.pop();
                    }

                    if (ch == ']' && top == '[') {
                        st.pop();
                    }

                } else {
                    st.pop();
                }

            }
        }

        // return true;
        if (st.isEmpty()) {
            System.out.println("true");
        }
        System.out.println("false123");
    }
}
