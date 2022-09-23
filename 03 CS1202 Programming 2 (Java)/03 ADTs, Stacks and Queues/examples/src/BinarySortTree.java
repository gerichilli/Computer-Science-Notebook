public class BinarySortTree {
    /**
     * An object of type TreeNode represents one node in a binary tree of strings.
     */
    private static class TreeNode {
        String item;
        TreeNode left;
        TreeNode right;

        // Constructor
        TreeNode(String str) {
            item = str;
        }
    }

    private static TreeNode root; // Pointer to the root of binary search tree

    /**
     * Return true if item is one of the items in the binary
     * sort tree to which root points. Return false if not.
     */
    public boolean treeContains(TreeNode root, String item) {
        // Tree is empty
        if(root == null ){
            return false; // so it certainly doesn't contain item.
        }
        // The item has been found in the root node
        else if (item.equals(root.item)) {
            return true;
        }
        // The item > root.item => the item is possible in the right subtree
        else if (item.compareTo(root.item) > 0) {
            return treeContains(root.right, item);
        }
        // The item < root.item => the item is possible in the left subtree
        else {
            return treeContains(root.left, item);
        }
    }

    /**
     * Add the item to the binary sort tree to which the global variable
     * "root" refers.  (Note that root can't be passed as a parameter to
     * this routine because the value of root might change, and a change
     * in the value of a formal parameter does not change the actual parameter.)
     */
    public void treeInsert(String newItem) {
        if(root == null) {
            // If the tree is empty
            // Then the newNode that contains newItem becomes the root
            root = new TreeNode(newItem);
            return;
        }

        TreeNode runner;
        runner = root;

        while (true) {
            if(newItem.compareTo(runner.item) < 0) {
                // The new item is less than the runner item
                // It must be inserted to the left subtree
                if(runner.left == null) {
                    runner.left = new TreeNode(newItem);
                    return;
                }

                runner = runner.left;
            }
            else {
                // The new item is larger than the runner item
                // It must be inserted to the right subtree
                if(runner.right == null) {
                    runner.right = new TreeNode(newItem);
                    return;
                }

                runner = runner.right;
            }
        }
    }

    /**
     * Print the items in the tree in inorder, one item to a line.
     * Since the tree is a sort tree, the output will be in increasing order.
     */
    private static void treeList(TreeNode node) {
        if(node != null) {
            treeList(node.left);
            System.out.print(node.item + " ");
            treeList(node.right);
        }
    }

    /**
     * Count the nodes in the binary tree.
     * @param node A pointer to the root of the tree.  A null value indicates
     * an empty tree.
     * @return the number of nodes in the tree to which node points.  For an
     * empty tree, the value is zero.
     */
    private static int countNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }
        else {
            int count = 1;
            count += countNodes(node.left);
            count += countNodes(node.right);
            return count;
        }
    }
}
