import java.util.*;

public class allbinary {
    public static void main(String[] args) {
        String str = "00110110";

        for (int i = 0; i <= str.length() - 2; i++) {
            String ss = str.substring(i, i + 2);
            System.out.print(ss + " ");
        }
    }
}
