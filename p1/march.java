import java.util.*;

public class march {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x - y) >= 10) {
                System.out.println("0");
                break;
            } else {
                int sum = x - y;
                int count = 0;
                while (sum < 10) {
                    sum += 3;
                    count++;
                }
                System.out.println("Count: " + count);
            }
            
        }
    }
}
