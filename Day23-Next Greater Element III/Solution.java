class Solution {
    public int nextGreaterElement(int n) {
        if(n <= 10)
            return -1;
        
        char num[] = String.valueOf( n ).toCharArray();
        int ans = 0;
        int i;
        int minIdx = num.length-1;
        
        for(i = num.length - 2; i >= 0; i--)
        {
            if( num[i] < num[i+1] )
            {
                char temp = num[i];
                num[i] = num[minIdx];
                num[minIdx] = temp;
                break;
            }
        }
        
        if(i == -1)
            return -1;
        
        for(char ele : num)
        {
            ans = ans*10 + (ele - '0');
        }
        return ans;
    }
}