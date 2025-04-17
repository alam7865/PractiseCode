import java.util.*;

public class allPath {

    public static int solve(int n, int m, int i, int j, int[][] grid) {
        if (i >= n || j >= m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        int right = solve(n, m, i, j + 1, grid);
        int down = solve(n, m, i + 1, j, grid);
        return right + down;
    }

    public static void main(String[] args) {
        int grid[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int n = grid.length;
        int m = grid[0].length;

        int ans = solve(n, m, 0, 0, grid);
        System.out.println("Result: " + ans);
    }
}
