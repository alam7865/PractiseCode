import java.util.*;

public class emptyTank {
    public static void main(String[] args) {
        // int c = 6, l = 1;
        // int c1 = c;
        // int count = 0;
        // int x = 1;

        // while (c != 0) {
        // count++;
        // c = c - x;
        // if (c == 0) {
        // break;
        // }
        // c += l;
        // if (c > c1) {
        // c = c1;
        // }

        // x++;
        // }

        // System.out.println(count);

        int arr1[] = { 9, 9, 9, 9, 9, 9 };
        int arr2[] = { 9, 9, 9 };

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }
        Collections.reverse(list1);
        Collections.reverse(list2);

        int i = 0;
        int j = 0;
        int carry = 0;

        while (i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i++);
            int num2 = list2.get(j++);
            int sum = num1 + num2 + carry;

            if (sum > 9) {
                carry = 1;
                list3.add(sum % 10);
            } else {
                carry = 0;
                list3.add(sum);
            }
        }

        while (i < list1.size()) {
            int sum = list1.get(i) + carry;
            if (sum > 9) {
                carry = 1;
                list3.add(sum % 10);
            } else {
                carry = 0;
                list3.add(sum);
            }
            i++;
        }

        while (j < list2.size()) {
            int sum = list2.get(j) + carry;
            if (sum > 9) {
                carry = 1;
                list3.add(sum % 10);
            } else {
                carry = 0;
                list3.add(sum);
            }
            j++;
        }

        list3.add(carry);

        System.out.println(list3.toString());
    }
}