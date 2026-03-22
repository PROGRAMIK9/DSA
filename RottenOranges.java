class Solution {
    public int orangesRot(int[][] mat) {
     int rows = mat.length, cols = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Initialize queue with all rotten oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j, 0}); // {row, col, time}
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int time = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1], t = curr[2];
            time = Math.max(time, t);

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && mat[nr][nc] == 1) {
                    mat[nr][nc] = 2; // rot it
                    fresh--;
                    q.add(new int[]{nr, nc, t + 1});
                }
            }
        }

        // Step 3: Check if any fresh oranges remain
        return fresh == 0 ? time : -1;
    }
}