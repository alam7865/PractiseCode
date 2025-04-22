import java.util.*;

public class printPermutation {

    // public static void permutation(String str, String res) {
    // if (res.length() >= 3) {
    // System.out.println(res);
    // return;
    // }

    // for (int i = 0; i < str.length(); i++) {
    // StringBuilder sb = new StringBuilder();
    // sb.append(str.substring(0, i));
    // sb.append(str.substring(i + 1, str.length()));

    // // System.out.println(sb.toString() + " " + str.charAt(i));
    // permutation(sb.toString(), res + str.charAt(i));
    // }
    // }

    public static void permutation(ArrayList<Integer> list1, ArrayList<Integer> list) {
        if (list.size() >= 3) {
            System.out.println(list.toString());
            return;
        }

        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int j = 0; j <= i - 1; j++) {
                res.add(list1.get(j));
            }
            for (int j = i + 1; j < list1.size(); j++) {
                res.add(list1.get(j));
            }
            ArrayList<Integer> aa = new ArrayList<>(list);
            // aa.add(list1.get(i));

            // System.out.println(res.toString());
            permutation(res, aa);

        }
    }

    public static void main(String[] args) {
        // String str = "123";

        // permutation(str, "");

        ///////////////////////////////
        ///
        int arr[] = { 1, 2, 3 };
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        permutation(list1, list);
    }
}
