


class Test {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int maxDia = 0;

    public static int diameter(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        maxDia = Math.max(maxDia, leftHeight + rightHeight + 1);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        System.out.println(maxDia);
        return 0;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-263);
        TreeNode node2 = new TreeNode(1813);
        TreeNode node3 = new TreeNode(3174);
        node.left = node2;
        node.right = node3;
        diameterOfBinaryTree(node);
    }
}