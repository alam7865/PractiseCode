import java.util.*;

public class rotatematrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int row = matrix.length;
        int col = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, top = 0;
        int bottom = matrix.length - 1;
        int right = col - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
