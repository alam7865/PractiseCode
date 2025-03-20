import java.util.*;

public class largestAreaHistogram {
    public static void main(String[] args) {
        int arr[] = { 60, 20, 50, 40, 10, 50, 60 };

        int n = arr.length;
        int NGL[] = new int[n];
        int NGR[] = new int[n];

        Stack<Integer> st = new Stack<>();
        int x = 1;
        NGL[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                NGL[x++] = st.peek();
            } else {
                NGL[x++] = -1;
            }
            st.push(i);
        }

        x = n - 1;
        st.clear();
        st.push(n - 1);
        NGR[x--] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                NGR[x--] = st.peek();
            } else {
                NGR[x--] = n;
            }

            st.push(i);
        }

        int width[] = new int[n];

        System.out.println(Arrays.toString(NGL));
        System.out.println(Arrays.toString(NGR));
        for (int i = 0; i < n; i++) {
            width[i] = (NGR[i] - NGL[i]) - 1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arr[i] * width[i]);
        }

        System.out.println(ans);
    }
}
