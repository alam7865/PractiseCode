class Solution {
    public int minFlips(int[][] grids) {
        int m1 = grids.length;
        int n1 = grids[0].length;

        int rowFlips = 0;
        for (int[] row : grids) {
            rowFlips += minFlipsToMakePalindrome(row);
        }

        int colFlips = 0;
        for (int j = 0; j < n1; j++) {
            int[] col = new int[m1];
            for (int i = 0; i < m1; i++) {
                col[i] = grids[i][j];
            }
            colFlips += minFlipsToMakePalindrome(col);
        }

        return Math.min(rowFlips, colFlips);
    }

    private static int minFlipsToMakePalindrome(int[] array) {
        int flips1 = 0;
        int lefts = 0;
        int rights = array.length - 1;
        while (lefts < rights) {
            if (array[lefts] != array[rights]) {
                flips1=flips1+1;
            }
            lefts++;
            rights--;
        }
        return flips1;
    }
}