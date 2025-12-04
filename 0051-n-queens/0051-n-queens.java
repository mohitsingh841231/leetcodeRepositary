class Solution {
    List<List<String>> res = new ArrayList<>();

    public void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiag,
                      boolean[] rdiag) {

        if (row == board.length) {
            res.add(build(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (!cols[col] && !ndiag[row + col] && !rdiag[row - col + board.length - 1]) {

                board[row][col] = true;
                cols[col] = true;
                ndiag[row + col] = true;
                rdiag[row - col + board.length - 1] = true;

                solve(board, row + 1, cols, ndiag, rdiag);

                board[row][col] = false;
                cols[col] = false;
                ndiag[row + col] = false;
                rdiag[row - col + board.length - 1] = false;
            }
        }
    }

    public List<String> build(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j] ? 'Q' : '.');
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2 * n - 1];
        boolean[] rdiag = new boolean[2 * n - 1];

        solve(board, 0, cols, ndiag, rdiag);
        return res;
    }
}