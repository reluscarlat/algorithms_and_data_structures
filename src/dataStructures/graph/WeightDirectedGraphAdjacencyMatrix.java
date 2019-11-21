package dataStructures.graph;

import java.util.Arrays;

public class WeightDirectedGraphAdjacencyMatrix {
    private int verteces;
    private int[][] matrix;

    public WeightDirectedGraphAdjacencyMatrix(int verteces) {
        this.verteces = verteces;
        matrix = new int[verteces][verteces];
        for(int i = 0; i < verteces; i++) {
            Arrays.fill(matrix[i], Integer.MAX_VALUE);
        }
    }

    public void addEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
    }

    public void printGraph() {
        for(int i = 0; i < verteces; i++) {
            for(int j = 0; j < verteces; j++) {
                if(matrix[i][j] != Integer.MAX_VALUE) {
                    System.out.println("Vertex " + i + " is directed to vertex " + j + " with weight " + matrix[i][j]);
                }
            }
        }
    }
}
