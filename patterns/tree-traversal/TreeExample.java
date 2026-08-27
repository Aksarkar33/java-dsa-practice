public class TreeExample {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(TreeNode node) {
        if (node == null) {
            return; //
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(9);

        inorder(root);
    }
}
