class Solution {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    int rows, cols;
    public boolean dfs(int r,int c,int[][] grid){
        if (r < 0 || r >= rows || c < 0 || c >= cols){
            return false;
        }
        if(grid[r][c] != 0){
            return true;
        }
        grid[r][c]=-1;
        boolean isclosed = true;
        for(int i = 0; i < 4 ;i++ ){
            isclosed &= dfs(r+dr[i],c+dc[i],grid);
        }
        return isclosed;
    }
    public int closedIsland(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int count=0;
        for(int i=0; i < rows;i++){
            for(int j=0 ;j<cols; j++){
                if(grid[i][j]==0){
                    if(dfs(i,j,grid)) count++;
                }
            }
        }
        return count;
    }
}