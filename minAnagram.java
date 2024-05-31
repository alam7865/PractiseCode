import java.util.*;

public class minAnagram {
    public static void main(String[] args) {
        String str = "abab"; // ans: 2
        int n = str.length();
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= str.length(); i++) {
            // String str = "";
            if (n % i == 0) {
                String str1 = str.substring(0, i);
                int len = str1.length();
                // putting str1 character in map
                int[] arr1 = new int[26];

                for (int i3 = 0; i3 < str1.length(); i3++) {
                    int idx = str1.charAt(i3) - 'a';
                    arr1[idx]++;
                }

                boolean istrue = true;
                for (int j = i; j < n; j += i) {
                    // System.out.println(str.substring(j, j + i));
                    String str2 = str.substring(j, j + i);

                    // putting str2 character in arr2

                    int[] arr2 = new int[26];

                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        int idx = str2.charAt(i2) - 'a';
                        arr2[idx]++;
                    }

                    // checking two array

                    for (int i1 = 0; i1 < 26; i1++) {
                        if (arr1[i1] != arr2[i1]) {
                            istrue = false;
                            break;
                        }
                    }
                }

                if (istrue == true) {
                    ans = Math.min(ans, len);
                }
            }

        }

        System.out.println("Ans: " + ans);

    }
}

//
// class Solution {
// public int minAnagramLength(String s) {
// Map<Character, Integer> charCount = new HashMap<>();

// for (char c : s.toCharArray()) {
// charCount.put(c, charCount.getOrDefault(c, 0) + 1);
// }

// int commonDivisor = charCount.get(s.charAt(0));

// for (int count : charCount.values()) {
// commonDivisor = calculateGCD(commonDivisor, count);
// }

// return s.length() / commonDivisor;
// }
// public int calculateGCD(int a, int b) {
// while (b != 0) {
// int temp = b;
// b = a % b;
// a = temp;
// }
// return a;
// }
// }