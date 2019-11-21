package dataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {
    int vertices;
    List<Integer> list[];

    public GraphAdjacencyList(int vertices) {
        this.vertices = vertices;
        list = new ArrayList[vertices];
        for(int i = 0; i < vertices; i++) {
            list[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].add(destination);
        list[destination].add(source);
    }

    public void printGraph() {
        for(int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for(int val : list[i]) {
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }

}
