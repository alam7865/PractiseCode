import java.util.*;

public class timediff {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");
        list.add("01:10");

        // for (int i = 0; i < list.size(); i++) {
        // String str = list.get(i);
        // String sub = str.substring(3, 5);
        // if (sub.equals("00")) {
        // System.out.println(Integer.parseInt("00"));
        // // ans.add(60);
        // } else {
        // ans.add(Integer.parseInt(sub));
        // }
        // }

        // Collections.sort(ans);
        // System.out.println(ans.toString());

        Collections.sort(list);
        System.out.println(list.toString());
    }
}
