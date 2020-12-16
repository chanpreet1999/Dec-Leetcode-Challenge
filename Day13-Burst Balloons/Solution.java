class Solution {
    public int maxCoins(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        int dp[][] = new int[ nums.length ][ nums.length ];
        
        for(int gap = 0; gap < dp.length; gap++)
        {
            for(int i = 0, j = gap; j < dp.length; i++, j++)
            {
                int max = -(int)1e9;
                for(int k = i; k <= j; k++ ) 
                {
                    int left = (k == i ? 0 : dp[i][k-1]);
                    int right = (k == j ? 0 : dp[k+1][j]);
                    int curVal = nums[k] * (i == 0 ? 1 : nums[i-1]) * (j == nums.length-1 ? 1 : nums[j+1]);
                    max = Math.max( max, left +  curVal + right);
                }
                dp[i][j] = max;
            }
        }
        return dp[0][ dp.length - 1 ];
    }
