package dataStructures.graph;

import java.util.*;

public class DirectedGraphAdjacencyList {
    private int verteces;
    private List<Integer>[] list;

    public DirectedGraphAdjacencyList(int verteces) {
        this.verteces = verteces;
        list = new ArrayList[verteces];
        for(int i = 0; i < verteces; i++) {
            list[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].add(destination);
    }

    public void printGraph() {
        for(int i = 0; i < verteces; i++) {
            if(!list[i].isEmpty()) {
                System.out.print("Vertex " + i + " is directed to: ");
                for(int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public List<Integer> bfsTraverse() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        HashSet<Integer> visited = new HashSet<>();
        List<Integer> bfsOrder = new ArrayList<>();
        int currentVertex;
        while (visited.size() != verteces) {
            currentVertex = queue.poll();
            if(visited.contains(currentVertex)) {
                continue;
            }
            visited.add(currentVertex);
            bfsOrder.add(currentVertex);
            List<Integer> neighbours = list[currentVertex];
            for(int vertex : neighbours) {
                    queue.add(vertex);
            }
        }
        return bfsOrder;
    }

    public List<Integer> dfsTraverse() {
        List<Integer> dfsOrder = new ArrayList<>();
        boolean[] visited = new boolean[verteces];
        dfsTraverse(0,visited, dfsOrder);
        return dfsOrder;
    }

    public void dfsTraverse(int currentVertex, boolean[] visited, List<Integer> dfsOrder) {
        if(!visited[currentVertex]) {
            dfsOrder.add(currentVertex);
            visited[currentVertex] = true;
            for(int vertex : list[currentVertex]) {
                dfsTraverse(vertex, visited, dfsOrder);
            }
        }
    }

    public void printAllPathsBetween(int a, int b) {
        boolean[] visited = new boolean[verteces];
        List<Integer> currentPath = new ArrayList<>();
        List<List<Integer>> paths = new ArrayList<>();
        dfsFindPaths(a,b,visited,currentPath, paths);
        for(List<Integer> ls : paths) {
            System.out.println(ls);
        }
    }

    public void dfsFindPaths(int current, int target, boolean[] visited, List<Integer> currentPath, List<List<Integer>> paths) {
        if(visited[current]) {
            return;
        }
        if(current == target) {
            currentPath.add(target);
            paths.add(new ArrayList<>(currentPath));
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        currentPath.add(current);
        visited[current] = true;
        for(int i = 0; i < list[current].size(); i++) {
            dfsFindPaths(list[current].get(i), target, visited, currentPath, paths);
        }
        currentPath.remove(currentPath.size() - 1);
        visited[current] = false;
    }
}
