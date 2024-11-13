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

    // Method to compute the height of the binary tree
    public int height(TreeNode node) {
        // Base case: if the node is null, return -1 (height of empty tree)
        if (node == null) {
            return -1;
        }

        // Recursively find the height of the left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the height of the current node as 1 + the max of the left and right subtree heights
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Method to print the tree (for testing purposes)
    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}
