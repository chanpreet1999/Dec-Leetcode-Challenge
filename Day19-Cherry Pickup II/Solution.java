class Solution {
    int dir[] = {-1, 0, 1};
    public int cherryPickup(int[][] grid) {
        if(grid.length == 0)
            return 0;
        
        Integer dp[][][] = new Integer[grid.length][ grid[0].length ][grid[0].length];
        
        return (helper( grid, 0, 0, grid[0].length-1, dp ) );
    }
    
    int helper( int grid[][], int r, int c1, int c2, Integer dp[][][] )
    {
        if( r == grid.length )
            return 0;
        
        if(dp[r][c1][c2] != null)
            return dp[r][c1][c2];
        int count = 0;
        for(int x : dir) {
            for(int y : dir) {
                if(c1 + x >= 0 && c1 + x < grid[0].length && c2 + y >= 0 && c2 + y < grid[0].length)
                    count  = Math.max( count , helper( grid, r+1,c1 + x, c2 + y, dp ) );
            }
        }
        count += grid[r][c1];
        count += (c1 == c2 ? 0 : grid[r][c2]);
        
        
        return dp[r][c1][c2] = count;
    }
}