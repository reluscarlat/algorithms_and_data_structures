package dataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphAdjacencyList {
    int vertices;
    List<Integer> list[];

    public UndirectedGraphAdjacencyList(int vertices) {
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

    public void detectCicles() {
        boolean[] visited = new boolean[vertices];
        List<List<Integer>> cicles = new ArrayList<>();
        dfsForCicles(0, visited, new ArrayList<>(), cicles, -1);
        if(!cicles.isEmpty()) {
            System.out.println("Cicles :");
            for(List<Integer> cicle : cicles) {
                System.out.println(cicle);
            }
        }
    }

    public void dfsForCicles(int currentVertex, boolean[] visited, List<Integer> currentList, List<List<Integer>> cicles, int prevVertex) {
        if(visited[currentVertex]) {
            List<Integer> cicle = new ArrayList<>(currentList);
            cicle.add(currentVertex);
            cicles.add(cicle);
        } else {
            for(int neighbour : list[currentVertex]) {
                if(neighbour == prevVertex) continue;
                currentList.add(currentVertex);
                visited[currentVertex] = true;
                dfsForCicles(neighbour, visited, currentList, cicles, currentVertex);
                currentList.remove(currentList.size() - 1);
                visited[currentVertex] = false;
            }
        }
    }
}
