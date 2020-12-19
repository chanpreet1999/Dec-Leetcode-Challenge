class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        
        for(int i : A)
        {
            for(int j : B)
            {
                int sum = i+j;
                hm.put( -sum, hm.getOrDefault( -sum, 0 ) + 1);
            }
        }

        for(int k : C)
        {
            for(int l : D)
            {
                count += hm.getOrDefault( k+ l, 0 );
            }
        }
        
        return count;        
    }
}