import java.util.*;

public class strAdd {
    public static void main(String args[]) {
        // char ch1 = '9';
        // int num1 = (int) (ch1 - '0') * 10;
        // System.out.println(num1);

        String str = "defRTSersUXI";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}