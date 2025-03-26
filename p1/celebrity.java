import java.util.*;

public class celebrity {

    public static int solve(int arr[][]) {
        int n = arr[0].length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 0) {
                st.push(i);
            } else {
                st.push(j);
            }
        }

        int cele = st.pop();

        for (int i = 0; i < n; i++) {
            if ((i != cele) && (arr[i][cele] == 0 || arr[cele][i] == 1)) {
                return -1;
            }
        }

        return cele;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 }
        };

        int ans = solve(arr);
        System.out.println("Result: " + ans);
    }
}
