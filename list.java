import java.util.*;

public class list {
    public static void main(String[] args) {
        String str = "birthdayboy";
        String patt = "birth";
        int len1 = patt.length();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length()-len1; i++) {
            if (str.charAt(i) == patt.charAt(0)) {
                String ss=str.substring(i, i+len1);
                // System.out.println(ss);
                if (ss.equals(patt)) {
                    // System.out.println(str.charAt(i));
                    list.add(i + 1);
                    i = i + len1;
                }
            }
        }

        // System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
    }
}
