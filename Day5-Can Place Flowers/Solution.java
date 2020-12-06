class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        int len = a.length;
       
        if(n > len/2 + 1)
            return false;
        
        for(int i = 0; i < len && n > 0; i++)
        {
            if( a[i] == 0 ) {
                if( i == 0 || (i > 0 && a[i-1] != 1) ) {
                    if( i == len-1 || (i < a.length-1 && a[i+1] != 1) ) {
                        a[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n <= 0;
    }
}