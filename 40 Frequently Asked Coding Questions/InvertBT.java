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

    // Method to invert or reverse the binary tree
    public void invertTree(TreeNode node) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }

        // Swap the left and right child of the current node
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(node.left);
        invertTree(node.right);
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

