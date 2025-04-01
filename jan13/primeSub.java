import java.util.*;

public class primeSub {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void cal() {
        boolean res[] = new boolean[1000000 + 1];
        Arrays.fill(res, true);

        for (int i = 2; i < 1000000 + 1; i++) {
            int pos = i;

            if (res[pos] == true) {
                while (pos + i < 1000000 + 1) {
                    pos += i;
                    if (res[pos] == true) {
                        res[pos] = false;
                    }
                }
            }
        }

        for (int i = 2; i < 1000000 + 1; i++) {
            if (res[i] == true) {
                list.add(i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // int ans = cal(x, y);
        cal();
        int res = (list.get(x - 1) * list.get(y - 1)) - 1;
        System.out.println("Result : " + res);
    }
}
