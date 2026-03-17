package graphprac;

public class Main {
    public static void main(String[] args) {

        graph g = new graph(5);

        g.addEdges(0, 1);
        g.addEdges(1, 2);
        g.addEdges(1, 3);
        g.addEdges(3, 4);

        g.printgraph();

    }

}
