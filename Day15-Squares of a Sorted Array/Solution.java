class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int ans[] = new int[n];
        int k = n-1, i = 0, j = n-1;
        while(i <= j)
        {
            if( Math.abs( A[i] ) > Math.abs(A[j]) )  
            {
                ans[k--] = A[i] * A[i];
                i++;
            }
            else
            {
                ans[k--] = A[j] * A[j];
                j--;
            }
        }
        return ans;
    }
}