import java.util.*;

public class maxOccur {
    public static void main(String[] args) {
        String str = "output";

        // int max = 0;
        // int idx = 0;

        // int arr[] = new int[26];

        // for (int i = 0; i < str.length(); i++) {
        // idx = (str.charAt(i) - 0) - 97;
        // arr[idx]++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // idx = i;
        // }
        // }
        // char cc = (char) (idx + 97);
        // System.out.println(cc);

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        // for (char c : ch) {
        // System.out.print(c + " ");
        // }

        // for (int i = 0; i < ch.length; i++) {
        // System.out.print(ch[i] + " ");
        // }

        char ch11[] = { 'a', 'c', 'b', 'e' };
        System.out.println(Arrays.toString(ch11));
    }
}
