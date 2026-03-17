package graphs;

import java.util.ArrayList;
import java.util.List;

public class Dfs {
    static void dfs(List<List<Integer>> adj, int u, boolean[] visited) {
        visited[u] = true;
        System.out.print(u + " "); // process node u

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(adj, v, visited);
            }
        }
    }

    public static void main(String[] args) {
        int n = 7; // nodes 0..5
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected graph from Section 9.1
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 2, 6);
        addEdge(adj, 3, 1);
        addEdge(adj, 4, 1);
        addEdge(adj, 5, 2);
        addEdge(adj, 6, 2);

        boolean[] visited = new boolean[n];
        System.out.print("DFS from 0: ");
        dfs(adj, 0, visited);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this line if the graph is directed
    }

}
