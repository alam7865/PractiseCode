import java.util.*;

public class stack1 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int istrue = 0;

        for (int i = 0; i < word.length(); i++) {
            char chh = word.charAt(i);
            // sb.append(chh);
            st.add(chh);
            if (chh == ch && istrue == 0) {

                if (i != 0) {
                    sb.append(chh);
                    System.out.println(st.size());
                    while (!st.isEmpty()) {
                        System.out.println(st.pop());
                        // sb.append(st.pop());
                    }

                    istrue = 1;
                }
            } else {
                if (istrue == 1) {

                    sb.append(chh);
                }
            }
        }

        // return sb.toString();
    }
}
