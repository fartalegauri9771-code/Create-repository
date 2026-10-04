import java.util.*;

class Node {

    int val;
    List<Node> neighbors;

    Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
}

class Solution9 {

    private Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {

       
        if (node == null) {
            return null;
        }

       
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

       
        Node clone = new Node(node.val);

       
        visited.put(node, clone);

        
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }

    
    public void printGraph(Node node, Set<Node> visitedNodes) {

        if (node == null || visitedNodes.contains(node)) {
            return;
        }

        visitedNodes.add(node);

        System.out.print(node.val + " -> ");

        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }

        System.out.println();

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visitedNodes);
        }
    }

    public static void main(String[] args) {

       
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

      
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

       
        Solution9 obj = new Solution9();

        Node clonedGraph = obj.cloneGraph(node1);

       
        System.out.println("Cloned Graph:");

        obj.printGraph(clonedGraph, new HashSet<>());
    }
}