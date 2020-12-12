class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i;
        int n = arr.length;
        
        if(  n == 1 || arr[n-1] >= arr[n-2] )
            return false;
        
        for( i = 0; i < n-1 && arr[i+1] > arr[i]; i++);
        
        if(i == 0)
            return false;
        
        for(; i < n-1 && arr[i] > arr[i+1]; i++);
        
        return i >= n-1;
    }
}