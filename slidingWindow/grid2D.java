import java.util.*;

public class grid2D {
    public static void main(String[] args) {
        int grid[][] = {
                { 1, 0, 1 },
                { 1, 0, 0 },
                { 1, 0, 0 },
        };

        int n = grid.length;
        int m = grid[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
            row[i] = count;
        }

        for (int j = 0; j < m; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
            col[j] = count;
        }

        // for (int i = 0; i < m; i++) {
        // System.out.print(col[i] + " ");
        // }

        long ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans += ((row[i] - 1) * (col[j] - 1));
                }
            }
        }

        System.out.println(ans);
    }
}
