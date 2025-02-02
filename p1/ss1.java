import java.util.*;

public class ss1 {

    public static boolean solve(String str) {
        ArrayList<Character> list1 = new ArrayList<>(); // number
        ArrayList<Character> list2 = new ArrayList<>(); // char

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            // int num = str.charAt(i) - '0';

            if (ch1 >= '0' && ch1 <= '9') {
                list1.add(ch1);
            }

            else if (ch1 >= 'a' && ch1 <= 'z') {
                list2.add(ch1);
            } else {
                return false;
            }

        }

        Collections.sort(list1);
        Collections.sort(list2);

        long len = list1.size() + list2.size();

        if (len != str.length()) {
            // System.out.println("NO");
            return false;
        }

        int x = 0;

        // 1
        for (int i = 0; i < list1.size(); i++, x++) {
            if (list1.get(i) != str.charAt(x)) {
                // System.out.println("NO");
                // x++;
                return false;

            }
        }

        // // 2
        for (int i = 0; i < list2.size(); i++, x++) {
            if (list2.get(i) != str.charAt(x)) {
                // System.out.println("NO");
                // x++;
                return false;

            }
        }

        // System.out.println("YES");
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            boolean ans = solve(str);
            if (ans == false) {
                System.out.println("NO");
            }

            if (ans == true) {
                System.out.println("YES");
            }
        }
    }
}
