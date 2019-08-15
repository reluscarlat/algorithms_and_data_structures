package dataStructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private class Node {
        public String data;
        public ArrayList<Node> neighbours;
        public boolean visited;

        public Node(){}

        public Node(String data) {
            this.data = data;
            this.neighbours = new ArrayList<Node>();
            this.visited = false;
        }
    }

    private ArrayList<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<Node>();
    }

    public void addNode(String data) {
        this.nodes.add(new Node(data));
    }

    public void addEdge(int src, int dest) {
        Node srcNode = this.nodes.get(src);
        Node destNode = this.nodes.get(dest);
        srcNode.neighbours.add(destNode);
    }

    public void printGraph() {
        for(Node node: nodes) {
            System.out.print("\nAdjacency list of " + node.data + " is: ");
            for(Node neighbour: node.neighbours) {
                System.out.print(neighbour.data+" ");
            }
        }
    }

    private boolean dfs(Node node, String data) {
        node.visited = true;
        System.out.print(" -> "+node.data);
        boolean result = false;
        if(node.data == data) {
            return true;
        }
        for(Node neighbour: node.neighbours) {
            if(!neighbour.visited)
                result = result || dfs(neighbour,data);
        }
        return result;
    }

    public boolean dfs(String srcName, String destName) {
        System.out.println("D.F.S.");
        Node srcNode = new Node();
        boolean nameFounded = false;
        for(Node src : nodes) {
            if(src.data == srcName) {
                srcNode = src;
                nameFounded = true;
            }
        }
        if(nameFounded) return dfs(srcNode,destName);
        return false;
    }

    private boolean bfs(Node node, String data, Queue<Node> queue) {
        System.out.print(" -> "+node.data);
        node.visited = true;
        boolean result = false;
        if(node.data == data) return true;
        for(Node neighbour: node.neighbours) {
            if(!neighbour.visited)
                queue.add(neighbour);
        }
        if(!queue.isEmpty()) {
            Node nextNode = queue.poll();
            result = result || bfs(nextNode, data, queue);
        }
        return result;
    }

    public boolean bfs(String srcName, String destName) {
        System.out.println("B.F.S.");
        Node srcNode = new Node();
        Queue<Node> queue = new LinkedList<Node>();
        boolean nameFounded = false;
        for(Node src : nodes) {
            if(src.data == srcName) {
                srcNode = src;
                nameFounded = true;
            }
        }
        if(nameFounded) return bfs(srcNode,destName,queue);
        return false;
    }
}
