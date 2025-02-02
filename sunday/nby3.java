import java.util.*;

public class nby3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        // 1 2 3 1 1
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(1);
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = a.size() / 3;
        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            map.put(a.get(i), map.getOrDefault(a.get(i), 0) + 1);

            if (map.get(a.get(i)) > 1) {
                // return a.get(i);
                System.out.println(a.get(i));
            }
        }

        // return -1;
        System.out.println("Ans" + -1);
    }
}
