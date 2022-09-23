public class BinaryTree {
    private static class TreeNode {
        int item;
        TreeNode left;
        TreeNode right;
    }

    /**
     * Count the nodes in the binary tree to which root points, and
     * return the answer.  If root is null, the answer is zero.
     */
    static int countNodes(TreeNode root) {
        // Base case
        // If the tree is empty return 0
        if(root == null) return 0;
        // Recursive case: root node + 2 subtree
        else {
            int count = 1; // the root node
            int countLeft = countNodes(root.left); // The number of nodes in the left subtree
            int countRight = countNodes(root.right); // The number of nodes in the right subtree
            count = count + countLeft + countRight;
            return count;
        }
    }

    /**
     * Print all the items in the tree to which root points.
     * The item in the root is printed first,
     * followed by the items in the left subtree
     * and then the items in the right subtree.
     */
    static void preorderPrint(TreeNode root) {
        // Base case: root == null: there is nothing to print
        if(root != null) {
            System.out.print(root.item + " "); // Print the root item
            preorderPrint(root.left); // print the left subtree's items
            preorderPrint(root.right); // print the right subtree's items
        }
    }
    /**
     * Print all the items in the tree to which root points.
     * The items in the left subtree are printed first,
     * followed by the items in the right subtree
     * and then the item in the root node.
     */
    static void postorderPrint(TreeNode root) {
        // Base case: root == null: there is nothing to print
        if (root != null) {
            postorderPrint(root.left); // print the left subtree's items
            postorderPrint(root.right); // print the right subtree's items
            System.out.print(root.item + " "); // Print the root item
        }
    }
    /**
     * Print all the items in the tree to which root points.
     * The items in the left subtree are printed first,
     * followed by the item in the root node
     * and then the items in the right subtree.
     */
    static void inorderPrint(TreeNode root) {
        // Base case: root == null: there is nothing to print
        if (root != null) {
            inorderPrint(root.left); // print the left subtree's items
            System.out.print(root.item + " "); // Print the root item
            postorderPrint(root.right); // print the right subtree's items
        }
    }
}
