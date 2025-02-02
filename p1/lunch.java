import java.util.*;

public class lunch {
    public static void main(String[] args) {
        int student[] = { 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 };
        int sandwitch[] = { 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 };
        // int student[]={1,1,0,0};
        // int sandwitch[]={0,1,0,1};
        int n = student.length;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < student.length; i++) {
            q1.add(student[i]);
        }

        for (int i = 0; i < sandwitch.length; i++) {
            q2.add(sandwitch[i]);
        }

        int count = 0;
        int count2 = 0;
        while (!q1.isEmpty()) {
            int x = q1.peek();
            int y = q2.peek();

            if (x == y) {
                q1.remove();
                q2.remove();
                count++;
                count2 = 0;
            } else {
                int a = q1.remove();
                q1.add(a);
                count2++;
            }

            if (count2 == q1.size()) {
                int ans = student.length - count2;
                System.out.println("ANS: " + q1.size());
                break;
            }
        }

        System.out.println("Last " + 0);

        // Two ways

        int arr[] = new int[2];

        for (int i = 0; i < n; i++) {
            arr[student[i]]++;
        }

        for (int i = 0; i < sandwitch.length; i++) {
            if (arr[sandwitch[i]] > 0) {
                arr[sandwitch[i]]--;
            } else {
                System.out.println(n - i);
                break;
            }
        }

        System.out.println(0);

    }
}
