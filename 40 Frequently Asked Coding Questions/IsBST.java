public class BinaryTree {

    // Definition of a tree node
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Function to check if the tree is a BST
    public static boolean isBST(TreeNode root) {
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper function with min and max constraints
    private static boolean isBSTHelper(TreeNode node, int min, int max) {
        // An empty node is considered valid
        if (node == null) {
            return true;
        }

        // Check if the current node violates the BST property
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        return isBSTHelper(node.left, min, node.val) && 
               isBSTHelper(node.right, node.val, max);
    }
}
