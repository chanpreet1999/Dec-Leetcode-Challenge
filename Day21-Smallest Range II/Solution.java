class Solution {
    public int smallestRangeII(int[] a, int k) {
        if(a.length == 1)
            return 0;
        int n = a.length;
        
        Arrays.sort(a);
        int ans = a[n-1]- a[0];
        for(int i = 0; i < n-1;i++)
        {
            int j = i+1;
            int low = Math.min( a[0] + k , a[j] - k);
            int high = Math.max( a[n-1] - k, a[i] + k );
            
            ans = Math.min( ans, high - low );
        }
        
        return ans;
    }
}