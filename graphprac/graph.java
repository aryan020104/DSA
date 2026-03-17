package graphprac;

import java.util.ArrayList;

public class graph {
    ArrayList<ArrayList<edge>> adj;
    int nodes;

    public graph(int nodes) {
        this.nodes = nodes;
        adj = new ArrayList<>();

        for (int i = 0; i < nodes; i++)
            adj.add(new ArrayList<>());

    }

    public void addEdges(int u, int v) {
        adj.get(u).add(new edge(u, v));
        adj.get(v).add(new edge(v, u));
    }

    public void printgraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + "  -->  ");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j).from + "  ");
            }
            System.out.println();
        }

    }
}
