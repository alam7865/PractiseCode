import java.util.*;

public class varibleWin {
    public static void main(String args[]) {
        // int arr[] = { 1, 0, 2, 1, 2 };
        // int ans = Integer.MAX_VALUE;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        // while (map.size() == 3) {
        // // calculation
        // ans = Math.min(ans, (i - j) + 1);
        // // remove the first character
        // map.put(arr[j], map.getOrDefault(arr[j], 0) - 1);
        // if (map.get(arr[j]) == 0) {
        // map.remove(arr[j]);
        // }
        // j++;
        // }
        // }

        // System.out.println(ans);

        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();

        int i = 0;
        int j = 0;
        int start = 0;
        int ans = Integer.MAX_VALUE;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
            if (map.get(s.charAt(j)) == 0) {
                count--;

                if (count == 0) {
                    while (count == 0) {
                        if(ans>j-i+1)
                        {
                            ans=j-i+1;
                            start
                        }
                    }
                }
            }
        }
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        HashMap<Character, Integer> mp = new HashMap<>();

        int ans = Integer.MAX_VALUE;
        int start = 0;

        for (char x : t.toCharArray())
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        int count = mp.size();

        int i = 0, j = 0;

        while (j < s.length()) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) - 1);
            if (mp.get(s.charAt(j)) == 0)
                count--;

            if (count == 0) {
                while (count == 0) {
                    if (ans > j - i + 1) {
                        ans = j - i + 1;
                        start = i;
                    }
                    mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
                    if (mp.get(s.charAt(i)) > 0)
                        count++;

                    i++;
                }
            }
            j++;
        }
        if (ans != Integer.MAX_VALUE)
            return s.substring(start, start + ans);
        else
            return "";
    }
}