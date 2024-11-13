import java.util.*;

public class Graph {

    // Adjacency list representation of the graph (using List of Lists)
    private List<List<Integer>> adjList;

    // Constructor to initialize the graph with a specific number of nodes
    public Graph(int numNodes) {
        adjList = new ArrayList<>();
        // Initialize the adjacency list with empty lists for each node
        for (int i = 0; i < numNodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph (undirected graph in this example)
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph
    }

    // BFS method
    public void bfs(int startNode) {
        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Queue to manage the BFS traversal
        Queue<Integer> queue = new LinkedList<>();
        
        // Start by enqueuing the starting node
        visited.add(startNode);
        queue.offer(startNode);
        
        while (!queue.isEmpty()) {
            // Dequeue a node from the front of the queue
            int node = queue.poll();
            
            // Print the node as it is visited
            System.out.print(node + " ");
            
            // Visit all the unvisited neighbors of the current node
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
