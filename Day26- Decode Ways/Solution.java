class Solution {
    public int numDecodings(String s) {
        int dp[] =  new int [s.length() + 1];
        Arrays.fill( dp, -1 );
        return helper( s, 0,dp );
        
    }
    
    int helper( String str, int idx, int dp[] )
    {
        if(idx == str.length()  )
            return dp[idx] = 1;
        
        if( str.charAt(idx) == '0' )
            return dp[idx] = 0;
        
        if(dp[idx] != -1)
            return dp[idx];
        
        int count = 0;
        count += helper( str, idx+1, dp );
        if( idx < str.length() - 1 )
        {
            int num1 = str.charAt(idx) - '0';
            int num2 = str.charAt(idx+1) - '0';
            int num = num1*10 + num2;
            if( num <= 26 )
                count += helper( str, idx+2, dp );
        }
        return dp[idx] = count;
    }
}