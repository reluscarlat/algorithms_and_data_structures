package dataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class WeightDirectedGraphAdjacencyList {
    private int verteces;
    private List<Edge> edges[];

    public static class Edge{
        public int source;
        public int destination;
        public int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public WeightDirectedGraphAdjacencyList(int verteces) {
        this.verteces = verteces;
        edges = new ArrayList[verteces];
        for(int i = 0; i < verteces; i++) {
            edges[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges[source].add(edge);
    }

    public void printGraph() {
        for(int i = 0; i < verteces; i++) {
            for(int j = 0; j < edges[i].size(); j++) {
                System.out.println("Vertex " + i + " is direct to vertex " + edges[i].get(j).destination
                        + " with weight " + edges[i].get(j).weight);
            }
        }
    }
}
