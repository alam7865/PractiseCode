public class maxConOne {
    public static void main(String[] args) {
        // int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;

        int count = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

            if (count == k) {
                max = Math.max(max, i - j + 1);
            }

            if (count > k) {
                while (count > k) {
                    if (arr[j] == 0) {
                        count--;
                    }
                    j++;
                }

                // max = Math.max(max, i - j + 1);
            }
        }

        System.out.println(max);
    }
}
