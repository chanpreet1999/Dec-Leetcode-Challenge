class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 2, fast = 2;
        
        
        while(fast < n)
        {
            if( nums[fast] != nums[ slow-2 ] )
                nums[slow++] = nums[fast];
            fast++;
        }
        return slow;
    }
}