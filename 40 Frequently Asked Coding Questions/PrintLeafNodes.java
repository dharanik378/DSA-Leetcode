// Definition for a binary tree node
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Method to print all leaf nodes
    public void printLeafNodes(TreeNode node) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }

        // If the node is a leaf node, print its data
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        // Recursively call the function on the left and right child nodes
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
}
