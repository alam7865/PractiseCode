public class max3 {
    public static void main(String args[]) {
        int arr[] = { -3, -5, 1, 0, 8, 3, -2 };
        int n = arr.length;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            }

            else if (min2 > arr[i]) {
                min2 = arr[i];
            }

            // max
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }

            else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            }

            else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }

        System.out.println(max1 + " " + max2 + " " + max3);
    }
}
