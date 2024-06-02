import java.util.*;

public class allBinaryCode {
    public static void main(String args[]) {
        String str = "00110110";
        HashSet<String> set = new HashSet<>();
        int k = 2;

        int index = 0;

        for (int i = 0; i <= str.length() - k; i++) {
            String ss = str.substring(i, i + k);
            set.add(ss);
        }

        int mapsize = set.size();

        int allset = (int) Math.pow(2, k);
        if (allset == mapsize) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}