import java.util.*;

class Solution {

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

      
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][m - 1] == 'O') dfs(board, i, m - 1);
        }

        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[n - 1][j] == 'O') dfs(board, n - 1, j);
        }

  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';  
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O'; 
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        int n = board.length;
        int m = board[0].length;

   
        if (x < 0 || y < 0 || x >= n || y >= m || board[x][y] != 'O') {
            return;
        }

        board[x][y] = '#'; 

   
        dfs(board, x - 1, y);
        dfs(board, x + 1, y);
        dfs(board, x, y - 1);
        dfs(board, x, y + 1);
    }
}