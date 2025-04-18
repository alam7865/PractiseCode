import java.util.*;

public class allPath {

    public static int solve(int n, int m, int i, int j, int[][] grid, ArrayList<Integer> list) {
        if (i >= n || j >= m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            list.add(grid[i][j]);
            System.out.println(list.toString());
            return 1;
        }

        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.add(grid[i][j]);

        int right = solve(n, m, i, j + 1, grid, list2);
        int down = solve(n, m, i + 1, j, grid, list2);
        return right + down;
    }

    public static void main(String[] args) {
        int grid[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        ArrayList<Integer> list = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;

        int ans = solve(n, m, 0, 0, grid, list);
        System.out.println("Result: " + ans);
    }
}
