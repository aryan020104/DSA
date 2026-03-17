package graphs;

import java.util.ArrayList;
import java.util.List;

public class BFSunidirected {
    public static void main(String[] args) {
        int n = 4; // nodes 0..3
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Graph D from above (has a cycle 0-1-2-0)
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 1, 3);

        boolean hasCycle = hasCycleDFS(adj, n);
        System.out.println("Has cycle? " + hasCycle);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph
    }

    static boolean hasCycleDFS(List<List<Integer>> adj, int n) {
        boolean[] visited = new boolean[n];

        for (int start = 0; start < n; start++) {
            if (!visited[start]) {
                if (dfsCheck(adj, start, -1, visited)) {
                    return true; // cycle found in this component
                }
            }
        }
        return false; // no cycle in any component
    }

    static boolean dfsCheck(List<List<Integer>> adj, int u, int parent, boolean[] visited) {
        visited[u] = true;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                // go deeper
                if (dfsCheck(adj, v, u, visited)) {
                    return true; // cycle found below
                }
            } else if (v != parent) {
                // visited neighbor that is not the parent → cycle
                return true;
            }
        }
        return false;
    }
}
