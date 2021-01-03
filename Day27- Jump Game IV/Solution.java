class Solution {
    
   
    HashMap<Integer, List<Integer>> graph;
    
    public int minJumps(int[] a) {
        int n = a.length;
        
        if(n <= 1)
            return 0;
        if(n == 2 || a[0]  == a[n-1])
            return 1;
        graph = new HashMap<>();
        
        createGraph( a, n );
        return bfs( a, n );
    }
    
    
    void createGraph( int[] a, int n ) {
    
        for(int i = 0; i < n; i++)
        {
            graph.computeIfAbsent( a[i], l -> new ArrayList() ).add(i);
        }
    }
    
    int bfs( int[] a, int n )
    {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Set<Integer> vis = new HashSet<>();
        int count = 0;
        
        q.add( 0 );
        vis.add(0);
        
        while( !q.isEmpty() )
        {
            int size = q.size();
            while(size-- > 0)
            {
                int cur = q.remove();
                if(cur == n-1)
                    return count;

                List<Integer> adjList = graph.get( a[cur] );
                adjList.add( cur-1 );
                adjList.add( cur+1 );
                
                for( int vtx : adjList )
                {
                    if( vtx >= 0 && vtx < n && !vis.contains(vtx) )
                    {
                        q.add( vtx );
                        vis.add(vtx);
                    }
                }
                adjList.clear();
            }
          
            count++;
        }
        
        return count;
    }
}