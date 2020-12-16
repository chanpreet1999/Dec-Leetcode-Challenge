class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> sAns = new ArrayList<>();
        
        helper(s, ans, sAns);
        return ans;
    }
    
    void helper(String str, List<List<String>> ans, List<String> sAns) {
        
        if( str.length() == 0 )
        {
            ans.add( new ArrayList<>(sAns) );
            return;
        }
        
        for(int i = 0; i < str.length(); i++) {
            
            if( isPalindrome( str, 0, i ) ) {
            
                sAns.add( str.substring( 0, i+1 ) );
                String roq = str.substring(i+1);
                
                helper( roq, ans, sAns );
                
                sAns.remove( sAns.size()-1 );
            }
        }
        
    }
    
    boolean isPalindrome( String str, int l, int h ) {
        while(l < h) {
            if( str.charAt(l) != str.charAt(h) )
                return false;
            l++;
            h--;
        }
        return true;
    }
}