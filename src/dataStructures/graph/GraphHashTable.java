package dataStructures.graph;

import java.util.HashMap;

public class GraphHashTable {
    private class Node {
        public String name;
        public int age;
        public HashMap<String, Node> neighbours;

        public Node(String name, int age) {
            this.name = name;
            this.age = age;
            this.neighbours = new HashMap<String, Node>();
        }
    }

    HashMap<String, Node> nodes;

    public GraphHashTable() {
        nodes = new HashMap<String, Node>();
    }

    public void addNode(String name, int age) {
        nodes.put(name , new Node(name,age));
    }

    public void addEdge(String name, String neighbourName) {
        if(nodes.containsKey(name) && nodes.containsKey(neighbourName)) {
            nodes.get(name).neighbours
                    .put(neighbourName, nodes.get(neighbourName));
        }
    }

    public void printRelations() {
        for(Node node : nodes.values()) {
            System.out.print("{ " + node.name + ", " +node.age + " } : ");
            for(Node neighbour : node.neighbours.values()) {
                System.out.print("{ " + neighbour.name +", "+ neighbour.age + " } ");
            }
            System.out.println();
        }
    }
}
