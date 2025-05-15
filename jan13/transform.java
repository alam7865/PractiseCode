import java.util.*;

public class transform {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);

        String str = "abcyy";
        int t = 2;
        int mod = 1000000000 + 7;
        int n = str.length();

        int arr[] = new int[27];

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'z') {
                arr[1]++;
                arr[2]++;
            } else {
                arr[map.get(ch)]++;
            }

        }
        System.out.println(Arrays.toString(arr));
        while (t-- > 0) {
            int res[] = new int[27];
            for (int i = 1; i <= 26; i++) {
                if (arr[i] != 0) {
                    if (i == 26) {
                        res[1] = (res[1] + arr[i]) % mod;
                        res[2] = (res[2] + arr[i]) % mod;
                    } else {
                        res[i + 1] += (arr[i]) % mod;
                    }
                }
            }

            System.out.println(Arrays.toString(res));

            arr = res;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
