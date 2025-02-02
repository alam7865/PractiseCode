import java.util.*;

public class kthdistance {
    public static void main(String[] args) {
        String str = "leetcode exercises sound delightful";
        String str1[] = str.split(" ");

        ArrayList<Character> list1 = new ArrayList<>();

        for (int i = 0; i < str1.length; i++) {
            String s = str1[i];
            int n = s.length();
            char f1 = s.charAt(0);
            char f2 = s.charAt(n - 1);

            list1.add(f1);
            list1.add(f2);
        }

        for (int i = 1; i < list1.size() - 1; i += 2) {
            char ch1 = list1.get(i);
            char ch2 = list1.get(i + 1);

            if (ch1 != ch2) {
                System.out.println("False");
            }
        }

        if (list1.get(0) != list1.get(list1.size() - 1)) {
            System.out.println("false1");
        }
    }
}
