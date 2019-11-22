package dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DisjointSet {
    static class Edge {
        public int source;
        public int destionation;

        public Edge(int source, int destionation) {
            this.source = source;
            this.destionation = destionation;
        }
    }

    static class Graph {
        private int vertices;
        private List<Edge>[] adjList; // don't need it for disjoint set generation;
        private List<Edge> edges;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjList = new ArrayList[vertices];
            this.edges = new ArrayList<>();
            for(int i = 0; i < vertices; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        public void addEdge(int source, int destination) {
            Edge edge = new Edge(source, destination);
            edges.add(edge);
            adjList[source].add(edge);
        }

        public void makeSet(int[] parent) {
            for(int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
        }

        public int find(int[] parent, int vertex) {
            if(parent[vertex] == vertex) {
                return vertex;
            } else {
                return find(parent, parent[vertex]);
            }
        }

        public void union(int[] parent, int x, int y) {
            int xParent = find(parent, x);
            int yParent = find(parent, y);
            parent[yParent] = xParent;
        }

        public void containsCycle() {
            int[] parents = new int[vertices];
            makeSet(parents);
            int x;
            int y;
            for(int i = 0; i < edges.size(); i++) {
                x = find(parents, edges.get(i).source);
                y = find(parents, edges.get(i).destionation);
                if(x == y) {
                    System.out.println("Contains cycle");
                    return;
                } else {
                    union(parents, edges.get(i).source, edges.get(i).destionation);
                }
            }
            System.out.println("Doesn't contains cycle");
        }

        public void disjointSets() {
            int[] parents = new int[vertices];
            makeSet(parents);
            int x;
            int y;
            for(int i = 0; i < edges.size(); i++) {
                x = find(parents, edges.get(i).source);
                y = find(parents, edges.get(i).destionation);
                if(x != y) {
                    union(parents, edges.get(i).source, edges.get(i).destionation);
                }
            }
            printSets(parents);
        }

        public void printSets(int[] parents) {
            HashMap<Integer, List<Integer>> djSets = new HashMap<>();
            for(int i = 0; i < parents.length; i++) {
                if(djSets.containsKey(parents[i])) {
                    djSets.get(parents[i]).add(i);
                } else {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(i);
                    djSets.put(parents[i], ls);
                }
            }
            for(int i : djSets.keySet()) {
                System.out.println("Disjoints sets for " + i + ": " + djSets.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(4, 5);
        graph.disjointSets();

        Graph graph1 = new Graph(6);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 4);
        graph1.addEdge(2, 3);
        graph1.addEdge(4, 5);
        graph1.containsCycle();

    }
}
