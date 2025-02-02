import java.util.*;

public class townJudge {
    public static void main(String[] args) {
        // int mat[][]={{1,3},{2,3},{3,1}};

        // int mat[][]={{1,2}};
        int mat[][] = { { 1, 3 }, { 2, 3 } };
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            map.put(mat[i][0], mat[i][1]);
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int key = set.getKey();
            int val = set.getValue();
            // System.out.println(key+" "+val);

            if (!map.containsKey(val)) {
                System.out.println(val);
            }
        }

        System.out.println("-1");
    }
}
