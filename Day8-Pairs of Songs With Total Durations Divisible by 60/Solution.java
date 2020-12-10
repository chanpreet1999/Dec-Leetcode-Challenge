class Solution {
    public int numPairsDivisibleBy60(int[] a) {
        final int num = 60;
        int count[] = new int[num];
        int ans = 0;
        
        
        for(int i = 0; i < a.length; i++)
        {
            int idx = a[i] % num;
            ans += count[idx == 0 ? 0 : num-idx ];
            count[ idx ]++;
        }
        
        return ans;
    }
}