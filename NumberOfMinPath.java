class Solution {
    public int countPaths(int V, int[][] edges) {
        // code here
         ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i = 0;i < V;i++)
            graph.add(new ArrayList<>());
        for(int e[]: edges){
            int u = e[0], v = e[1], w = e[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        
        //Let's initialize dist[] and ways[]
        long dist[] = new long[V];
        Arrays.fill(dist, Long.MAX_VALUE);
        int ways[] = new int[V];
        dist[0] = 0;
        ways[0] = 1;
        
        //DIJKSTRA with priority queue
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[]{0, 0}); //{node, distance}
        
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            int u = (int) curr[0];
            long d = curr[1];
            
            if(d > dist[u])
                continue;
                
            for(int edge[]: graph.get(u)){
                int v = edge[0];
                long w = edge[1];
                
                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    ways[v] = ways[u];
                    pq.add(new long[]{v, dist[v]});
                }
                else if(dist[u] + w == dist[v])
                    ways[v] += ways[u];
            }
        }
    
        return ways[V - 1] == 0 ? 0 : ways[V - 1];
    }
}
