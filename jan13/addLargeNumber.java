import java.util.*;

public class addLargeNumber {

    public static String solve(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder ans = new StringBuilder();

        int n1 = sb1.length();
        int n2 = sb2.length();
        int carry = 0;
        while ((sb1.length() > 0) || (sb2.length() > 0)) {
            int first = sb1.length() > 0 ? sb1.charAt(sb1.length() - 1) - '0' : 0;
            int second = sb2.length() > 0 ? sb2.charAt(sb2.length() - 1) - '0' : 0;
            int sum = first + second + carry;

            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ans.insert(0, sum);

            if (sb1.length() > 0) {
                sb1.setLength(sb1.length() - 1);
            }

            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
        }

        if (carry == 1) {
            ans.insert(0, 1);
        }

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) > '0') {
                return ans.substring(i);
            }
        }

        System.out.println(ans.toString());
        return "sab";
    }

    public static void main(String[] args) {
        String str1 = "0000000000000000125";
        String str2 = "23";

        String ans = solve(str1, str2);
        System.out.println(ans);

        // java.math.BigInteger a = new java.math.BigInteger(str1);
        // java.math.BigInteger b = new java.math.BigInteger(str2);
        // java.math.BigInteger c = a.add(b);

        // System.out.println(c.toString());
    }
}

// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        StringBuilder a = new StringBuilder(s1);
        StringBuilder b = new StringBuilder(s2);
        StringBuilder ans = new StringBuilder();

        int carry = 0;

        while (a.length() > 0 || b.length() > 0) {
            int first = a.length() > 0 ? a.charAt(a.length() - 1) - '0' : 0;
            int second = b.length() > 0 ? b.charAt(b.length() - 1) - '0' : 0;
            int sum = first + second + carry;

            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            ans.insert(0, sum);
            if (a.length() > 0) {
                a.setLength(a.length() - 1);
            }

            if (b.length() > 0) {
                b.setLength(b.length() - 1);
            }
        }

        // 0000100
        if (carry == 1) {
            ans.insert(0, 1);
        }

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) > '0') {
                return ans.substring(i);
            }
        }

        return "0";
    }
}
