class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int rows = a.length, cols = a[0].length;
        int max = Math.max( rows, cols);
        int count = 0, k = 0;
        int ans[] = new int[rows * cols];
        
        for(int gap = 0; gap < max; gap++ )
        {
            if(count%2 == 0)
            {
                for(int i = gap, j = 0; i >= 0; i--, j++)
                {
                    ans[k++] = a[i][j];
                }
            }
            else
            {
                for(int i = 0, j = gap; j >= 0; i++, j--)
                {
                    ans[k++] = a[i][j]; 
                }
            }
            count++;
        }
        
        for(int gap = max-2; gap >= 0; gap-- )
        {
            if(count%2 == 0)
            {
                for(int i = gap, j = 0; i >= 0; i--, j++)
                {
                    ans[k++] = a[i][j];
                }
            }
            else
            {
                for(int i = 0, j = gap; j >= 0; i++, j--)
                {
                    ans[k++] = a[i][j]; 
                }
            }
            count++;
        }
        
        
        return ans;
    }
}