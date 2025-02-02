import java.util.*;

public class longPanindrom {
    public static void main(String[] args) {
        // String str = "a";
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // int count = 0;
        // boolean numbool = false;
        // for (Map.Entry<Character, Integer> set : map.entrySet()) {
        // char ch = set.getKey();
        // int num = set.getValue();

        // if (num == 1 && numbool == false) {
        // count++;
        // numbool = true;
        // } else if (num > 1) {
        // if (num % 2 == 0) {
        // count += num;
        // } else {
        // count += (num - 1);
        // }
        // }
        // // System.out.println(ch + " " + num);
        // }

        // System.out.println(count);

        String str = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            char ch = set.getKey();
            int num = set.getValue();

            System.out.println(ch + " " + num);
        }

        // if (map.size() == 1) {
        // int num = map.get(str.charAt(0));
        // // return num;
        // }

        // if (map.size() == 2) {
        // int num1 = map.get(str.charAt(0));
        // // int num1 = 0;
        // int num2 = map.get(str.charAt(1));
        // System.out.println("summm: " + num1 + " " + num2);
        // int sum = num1 + num2;
        // if (sum % 2 != 0) {
        // // return sum;
        // System.out.println("sum1: " + sum);
        // }
        // // else{
        // // return sum-1;
        // System.out.println("sum2:: " + (sum));
        // // }

        // }
        // int count = 0;
        // boolean numbool = false;
        // for (Map.Entry<Character, Integer> set : map.entrySet()) {
        // char ch = set.getKey();
        // int num = set.getValue();

        // if (num == 1 && numbool == false) {
        // count++;
        // numbool = true;
        // } else if (num > 1) {
        // if (num % 2 == 0) {
        // count += num;
        // } else {
        // count += (num - 1);
        // }
        // }
        // // System.out.println(ch + " " + num);
        // }

        // // System.out.println(count);
        // // return count;
        // System.out.println("count: " + count);
    }
}
