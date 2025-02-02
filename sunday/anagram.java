import java.util.*;

public class anagram {
    public static void main(String[] args) {
        // String s1 = "basgadhbfgvhads";
        // String s2 = "sjdhgvbjdsbhvbvd";
        // int arr1[] = new int[26];
        // int arr2[] = new int[26];

        // for (int i = 0; i < s1.length(); i++) {
        // char ch = s1.charAt(i);
        // int idx = (ch - 0) - 97;
        // arr1[idx]++;
        // // System.out.println(idx);
        // // break;
        // }

        // for (int i = 0; i < s2.length(); i++) {
        // char ch = s2.charAt(i);
        // int idx = (ch - 0) - 97;
        // arr2[idx]++;
        // }

        // int sum = 0;

        // for (int i = 0; i < 26; i++) {
        // sum += Math.abs(arr1[i] - arr2[i]);
        // }

        // // return sum;
        // System.out.println(sum);

        // /////////////////////////////////////////////////////////
        String str = "geEksforGEeks";
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (set.add(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
