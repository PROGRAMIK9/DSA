import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    
    private void dfs(int u, int p, ArrayList<ArrayList<Integer>> adj, int[] disc, 
                     int[] low, boolean[] visited, boolean[] isArticulation, int[] timer) {
        
        visited[u] = true;
        // timer[0] acts as our global/reference timer
        disc[u] = low[u] = ++timer[0];
        int children = 0;

        for (int v : adj.get(u)) {
            if (v == p) continue; // Don't go back to parent

            if (visited[v]) {
                // Back-edge: Update low value based on discovery time of neighbor
                low[u] = Math.min(low[u], disc[v]);
            } else {
                // Tree-edge: Standard DFS
                children++;
                dfs(v, u, adj, disc, low, visited, isArticulation, timer);
                
                // On backtracking, update low value
                low[u] = Math.min(low[u], low[v]);

                // Condition 1: u is not root and low[v] >= disc[u]
                if (p != -1 && low[v] >= disc[u]) {
                    isArticulation[u] = true;
                }
            }
        }

        // Condition 2: u is root and has more than one child
        if (p == -1 && children > 1) {
            isArticulation[u] = true;
        }
    }
    
    // Removed static to avoid context conflicts, and made public to match typical platform templates
    public ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        
        // 1. Build the Adjacency List from the edges array
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // Graph is undirected
        }

        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] visited = new boolean[V];
        boolean[] isArticulation = new boolean[V];
        
        // 2. Use a single-element array for the timer to pass it by reference
        int[] timer = new int[]{0}; 
        
        // Initialize arrays
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, -1, adj, disc, low, visited, isArticulation, timer);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        
        return result;
    }
}