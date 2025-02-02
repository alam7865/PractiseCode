import java.util.*;

public class stringGreat {
    public static void main(String[] args) {
        // String str = "leEeetcode";
        String str = "abBAcC";

        Stack<Character> st = new Stack<>();
        char ch = str.charAt(0);
        st.push(ch);

        for (int i = 1; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            if (st.isEmpty()) {
                st.push(ch1);
            } else if (!st.isEmpty() && st.peek() == ch1) {
                st.push(ch1);
            } else if ((st.peek() >= 'A' && st.peek() <= 'Z') && (ch1 >= 'A' && ch1 <= 'Z')) {
                st.push(ch1);
            }

            else if ((st.peek() >= 'a' && st.peek() <= 'z') && (ch1 >= 'a' && ch1 <= 'z')) {
                st.push(ch1);
            } else {
                char last = st.peek();
                if (last >= 'A' && last <= 'Z') {
                    int idx1 = (int) last - 97;
                    int idx2 = (int) ch1 - 65;
                    System.out.println("Idx11 " + idx1 + " " + "Idx2 " + idx2);
                    if (idx1 == idx2) {
                        st.pop();
                    }
                }

                if (last >= 'a' && last <= 'z') {
                    int idx1 = (int) last - 65;
                    int idx2 = (int) ch1 - 97;
                    System.out.println("Idx11 " + idx1 + " " + "Idx2 " + idx2);
                    if (idx1 == idx2) {
                        st.pop();
                    }

                }
            }

        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        System.out.println(sb.reverse().toString());
    }
}
