package dataStructures.graph;

public class GraphAdjacencyMatrix {
    private int vertices;
    private int[][] matrix;

    public GraphAdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void printMatrix() {
        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printEdges() {
        for(int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for(int j = 0; j < vertices; j++) {
                if(matrix[i][j] != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
