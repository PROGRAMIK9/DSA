class Solution {
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        // Base case
        if (V == 1) {
            res.add(0);
            return res;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        int[] degree = new int[V];
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected, so add both ways!
            degree[u]++;
            degree[v]++;
        }
        
        // 2. Initialize Queue with leaves
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (degree[i] == 1) {
                q.add(i);
            }
        }
        
        // 3. Prune layer by layer
        int count = V;
        while (count > 2) { // Fix: stop when 2 or fewer nodes remain
            int s = q.size();
            count -= s;
            
            // Fix: properly iterate 's' times
            for (int i = 0; i < s; i++) { 
                int node = q.poll(); // poll() removes and returns the head
                
                // Fix: iterate through all neighbors of the popped leaf
                for (int neighbor : adj.get(node)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        q.add(neighbor);
                    }
                }
            }
        }
        
        // 4. Whatever is left in the queue is our answer
        while (!q.isEmpty()) {
            res.add(q.poll());
        }
        
        return res;
    }
}