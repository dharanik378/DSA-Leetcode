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

    // Recursive DFS method
    public void dfs(int node, Set<Integer> visited) {
        // Print the node as it is being visited
        System.out.print(node + " ");
        
        // Mark the node as visited
        visited.add(node);

        // Recur for all the vertices adjacent to this node
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    // Wrapper method to start DFS traversal from a given node
    public void dfsTraversal(int startNode) {
        Set<Integer> visited = new HashSet<>();
        dfs(startNode, visited);
    }
}
