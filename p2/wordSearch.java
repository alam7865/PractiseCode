import java.util.*;

public class wordSearch {

    public static boolean dfs(char board[][], int i, int j, String word, int lastIdx) {
        if (word.length() == lastIdx) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }

        // invalid case

        if (board[i][j] == ' ' || board[i][j] != word.charAt(lastIdx)) {
            return false;
        }

        char ch = board[i][j];
        board[i][j] = ' ';
        if (dfs(board, i - 1, j, word, lastIdx + 1) || dfs(board, i, j + 1, word, lastIdx + 1)
                || dfs(board, i + 1, j, word, lastIdx + 1) || dfs(board, i, j - 1, word, lastIdx + 1)) {
            return true;
        }

        board[i][j] = ch;

        return false;
    }

    public static void main(String[] args) {
        char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "SEE";

        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j]) {
                    boolean ans = dfs(board, i, j, word, 0);
                    if (ans) {
                        System.out.println("Found It's True");
                    }
                }
            }
        }

        System.out.println("Not Found");
    }
}
