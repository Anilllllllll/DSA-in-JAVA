import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) q.add(new int[]{i, j});
            }
        }

        if (fresh == 0) return 0;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int time = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            boolean check = false;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                for (int d = 0; d < 4; d++) {
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        q.add(new int[]{nx, ny});
                        fresh--;
                        check = true;
                    }
                }
            }

            if (check) time++;
        }

        return (fresh == 0) ? time : -1;
    }
}