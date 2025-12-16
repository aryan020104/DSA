package graphs;


import java.util.ArrayList;

public class BFS_ArrayList {

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];
        int[] queue = new int[graph.size()];

        int front = 0, rear = 0;

        // Add starting node
        queue[rear++] = start;
        visited[start] = true;

        while (front < rear) {
            int node = queue[front++];   // remove from queue
            System.out.print(node + " "); // visit (print)

            // Check neighbors from ArrayList
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    queue[rear++] = neighbor; // add to queue
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Create graph using ArrayList
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // 4 nodes → 0, 1, 2, 3
        for (int i = 0; i < 20; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(1).add(3);
        graph.get(1).add(9);
        graph.get(3).add(11);
        graph.get(3).add(7);
        graph.get(9).add(5);
        graph.get(9).add(13);
        graph.get(7).add(19);
        graph.get(5).add(17);
        graph.get(5).add(15);

        // Run BFS from node 0
        bfs(graph, 1);
    }
}


