class Solution {

    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9], col = new int[9], box = new int[9];

        for (int i = 0; i < 9; i++) {
            Arrays.fill(row, 0);
            Arrays.fill(col, 0);
            Arrays.fill(box, 0);

            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];
                char b = board[(i / 3) * 3 + j / 3][(i % 3) * 3 + j % 3];

                if (r != '.' && ++row[r - '1'] > 1) return false;
                if (c != '.' && ++col[c - '1'] > 1) return false;
                if (b != '.' && ++box[b - '1'] > 1) return false;
            }
        }
        return true;
    }
}
