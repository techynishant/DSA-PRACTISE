class Solution {
    static Integer mod = 1_000_000_007;
    static Integer[][][] dp;
    public int uniquePaths(int[][] grid) {
        dp = new Integer[grid.length][grid[0].length][2];
        return solve(0,0,0,grid);
    }
    public int solve(int i,int j,int dir,int[][] grid){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 ) return 0;

        if(i == grid.length - 1 && j == grid[0].length - 1) return 1;

        if(dp[i][j][dir] != null) return dp[i][j][dir];

        int down = 0;
        int right = 0;

        if(grid[i][j] == 1){
            if(dir == 1){
                down = solve(i+1,j,0,grid);
            }else{
                right = solve(i,j+1,1,grid);
            }
        }else{
            down = solve(i+1,j,0,grid);
            right = solve(i,j+1,1,grid);
        }

        return dp[i][j][dir] = (down + right) % mod;
    }

}