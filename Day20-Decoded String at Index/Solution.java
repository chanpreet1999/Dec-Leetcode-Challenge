class Solution {
    public String decodeAtIndex(String S, int K) {
     
        long size = 0;
        for(char ch : S.toCharArray() )
        {
            if( Character.isDigit( ch ) )
            {
                size = size * Integer.parseInt( ch + "" );
            }
            else
                size++;
        }
        for(int i = S.length()-1; i >= 0; i-- )
        {
            char ch = S.charAt(i);
            K %= size;
            if(K == 0 && !Character.isDigit(ch))
                return "" + ch;
            if(Character.isDigit( ch ))
                size = size/ Integer.parseInt( ch + "" );
            else 
                size--;
        }
        
        return "";
    }
}