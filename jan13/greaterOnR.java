import java.util.*;

public class greaterOnR {
    public static void main(String args[]) {
        // int arr[] = { 2, 3, 1, 9 };
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int x = arr[i];
            arr[i] = st.peek();
            if (x > st.peek()) {
                st.push(x);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
