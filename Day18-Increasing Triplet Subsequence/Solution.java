class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        
        for(int ele : nums) 
        {
            if( ele <= f )
                f = ele;
            else if( ele <= s )
                s = ele;
            else
                return true;
        }
        return false;
    }
}