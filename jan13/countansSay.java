public class countansSay {
    public static void main(String args[]) {
        // String str = "1211";
        // StringBuilder sb = new StringBuilder();

        // int count = 1;
        // char ch = str.charAt(0);
        // int i = 1;
        // int n = str.length();

        // while (i < n) {
        // char ch1 = str.charAt(i);
        // if (ch1 == ch) {
        // count++;
        // } else {
        // sb.append(count);
        // sb.append(ch);
        // count = 1;
        // ch = ch1;
        // }
        // i++;
        // }

        // sb.append(count);
        // sb.append(ch);

        // System.out.println(sb.toString());

        ///////////////////////////////////////////////////////////////
        ///
        int n = 7;
        String arr[] = new String[30 + 1];
        arr[0] = "0";
        arr[1] = "1";
        arr[2] = "11";
        arr[3] = "21";
        arr[4] = "1211";
        arr[5] = "111221";

        for (int k = 6; k <= 30; k++) {
            String str = arr[k - 1];

            StringBuilder sb = new StringBuilder();

            int count = 1;
            char ch = str.charAt(0);
            int i = 1;
            int n1 = str.length();

            while (i < n1) {
                char ch1 = str.charAt(i);
                if (ch1 == ch) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(ch);
                    count = 1;
                    ch = ch1;
                }
                i++;
            }

            sb.append(count);
            sb.append(ch);

            arr[k] = sb.toString();
        }

        // return arr[n];
        System.out.println(arr[7]);

    }
}
