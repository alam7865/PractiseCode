import java.util.*;

public class highestPro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 0, -1, 3, 100, 70, 50
        list.add(0);
        list.add(-1);
        list.add(3);
        list.add(100);
        list.add(-70);
        list.add(-50);

        // 0, -1, 3, 100, -70, -50
        Collections.sort(list);

        int product1 = list.get(0) * list.get(1) * list.get(list.size() - 1);
        int product2 = list.get(0) * list.get(list.size() - 1) * list.get(list.size() - 2);
        int max = Math.max(product1, product2);
        System.out.println(max);
    }
}
