class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int t = 0, b = n-1;
        int l = 0, r = n-1;
        int count = 1;
        
        n = n*n;
        while(count <= n)
        {
            for(int i = l; i <= r; i++ ) 
            {
                ans[t][i] = count++;
            }
            t++;
            
            for(int i = t; i <= b; i++ ) 
            {
                ans[i][r] = count++;
            }
            r--;
            
            for(int i = r; i >= l; i-- ) 
            {
                ans[b][i] = count++;
            }
            b--;
            
            for(int i = b; i >= t; i-- ) 
            {
                ans[i][l] = count++;
            }
            l++;
            
        }
        
        return ans;
    }
}