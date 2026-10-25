class Solution {
    int[][] ds = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, longestPath = 0;
        dp = new int[n][m];
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < m; j ++)
                dp[i][j] = -1;
        
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                longestPath = Math.max(longestPath, dfs(matrix, i, j, Integer.MIN_VALUE));
            }
        }
        return longestPath;
    }

    private int dfs(int[][] matrix, int i, int j, int prev) {
        int n = matrix.length, m = matrix[0].length;
        if (!(i >= 0 && i < n && j >= 0 && j < m) || matrix[i][j] <= prev)
            return 0;

        if (dp[i][j] > -1)
            return dp[i][j];

        int res = 1;
        for (int[] d: ds) {
            res = Math.max(res, 1 + dfs(matrix, d[0] + i, d[1] + j, matrix[i][j]));
        }
        return dp[i][j] = res;
    }
}
