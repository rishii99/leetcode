class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        dp = new int[n][n];
        // Initialize with -1
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        return solve(s, 0, n - 1);
    }
    public int solve(String s, int i, int j) {
        // Base cases
        if (i > j)
            return 0;
        if (i == j)
            return 1;
        // Already calculated
        if (dp[i][j] != -1)
            return dp[i][j];
        // Characters match
        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = 2 + solve(s, i + 1, j - 1);
        } else {
            // Characters do not match
            dp[i][j] = Math.max(
                    solve(s, i + 1, j),
                    solve(s, i, j - 1)
            );
        }
        return dp[i][j];
    }
}