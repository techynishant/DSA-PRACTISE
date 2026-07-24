class Solution {
    static int MOD = 1_000_000_007;
    static Integer[][][] dp;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Integer[m][n][maxMove+1];

        return solve(m,n,maxMove,startRow,startColumn);
    }
    public int solve(int m,int n, int max,int sr,int sc){
        if(sc >= n || sr >= m || sc < 0 || sr < 0){
            return 1;
        }

        if(max == 0) return 0;
        
        if(dp[sr][sc][max] != null){
            return dp[sr][sc][max];
        }

        long left = solve(m,n,max-1,sr-1,sc);
        long right = solve(m,n,max-1,sr+1,sc);
        long down = solve(m,n,max-1,sr,sc-1);
        long up = solve(m,n,max-1,sr,sc+1);

        long ans = (left + right + up + down) % MOD;

        return dp[sr][sc][max] = (int) ans;
    }
}