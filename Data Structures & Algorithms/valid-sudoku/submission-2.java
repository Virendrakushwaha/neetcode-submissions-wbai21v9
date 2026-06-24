class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board[0].length;
        int n = board.length;
        HashSet<Character> set = new HashSet<>();
        // row wise checking
        for (int i = 0; i < m; i++) {
            set.clear();
            for (int j = 0; j < n; j++) {
                if (set.contains(board[i][j]))
                    return false;
                else if (board[i][j] == '.')
                    continue;
                set.add(board[i][j]);
            }
        }

        // column wise checking
        for (int i = 0; i < m; i++) {
            set.clear();
            for (int j = 0; j < n; j++) {
                if (set.contains(board[j][i]))
                    return false;
                else if (board[j][i] == '.')
                    continue;
                set.add(board[j][i]);
            }
        }
        for (int k = 0; k < 9; k++) {
            set.clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (k / 3 * 3) + i;
                    int col = (k % 3 * 3) + j;
                    if (set.contains(board[row][col]))
                        return false;
                    else if (board[row][col] == '.')
                        continue;
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
