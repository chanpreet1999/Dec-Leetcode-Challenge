class Solution {
    public int largestRectangleArea(int[] a) {
        if(a.length == 0)
            return 0;
        int n = a.length;
        int sol[] = getSol(a, n);
        int sor[] = getSor(a, n);
        
        int maxArea = -(int)1e9;
        for(int i = 0; i < n; i++)
        {
            maxArea = Math.max( maxArea, a[i] * (sor[i] - sol[i] - 1) );
        }
        return maxArea;
    }
    
    int[] getSor( int a[], int n )
    {
        int sor[] = new int[n];
        Arrays.fill(sor , n);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++)
        {
            while( !st.isEmpty() && a[st.peek()] > a[i] )
            {
                sor[ st.peek() ] = i;
                st.pop();
            }
            st.push(i);
        }
     
        return sor;
    }
    
    int[] getSol( int a[], int n )
    {
        int sol[] = new int[n];
        Arrays.fill(sol , -1);
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1; i >= 0; i--)
        {
            while( !st.isEmpty() && a[st.peek()] > a[i] )
            {
                sol[ st.peek() ] = i;
                st.pop();
            }
            st.push(i);
        }
        
        return sol;
    }
    
//     void display( int a[] )
//     {
//         for(int ele : a)
//             System.out.print(ele + " ");
//          System.out.println();
//     }
   
}