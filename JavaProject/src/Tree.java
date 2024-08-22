import java.util.Queue;
import java.util.LinkedList;

public class Tree {
    static class Node {
        int data;
        Node leftTree;
        Node rightTree;
        Node(int data) {
            this.data = data;
            this.leftTree = null;
            this.rightTree = null;
        }
    }

    static class BinaryTree {
        public static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node node = new Node(nodes[idx]);
            node.leftTree = buildTree(nodes);
            node.rightTree = buildTree(nodes);
            return node;
        }

        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.leftTree);
            preorder(root.rightTree);
        }

        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.leftTree);
            System.out.print(root.data + " ");
            inorder(root.rightTree);
        }

        public static void postorder(Node root) {
            if(root == null) {
                return;
            }
            postorder(root.leftTree);
            postorder(root.rightTree);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()) {
                Node removeNode = queue.remove();
                if(removeNode == null) {
                    System.out.println();
                    if(queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(removeNode.data + " ");
                    if(removeNode.leftTree != null) {
                        queue.add(removeNode.leftTree);
                    }
                    if(removeNode.rightTree != null) {
                        queue.add(removeNode.rightTree);
                    }
                }
            }
        }

        public static int countNodes(Node root) {
            if(root == null) {
                return 0;
            }
            return countNodes(root.leftTree) + countNodes(root.rightTree) + 1;
        }

        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            return sumOfNodes(root.leftTree) + sumOfNodes(root.rightTree) + root.data;
        }

        public static int heightOfTree(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = heightOfTree(root.leftTree);
            int rightHeight = heightOfTree(root.rightTree);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int maxDia = 0;
        public static int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = heightOfTree(root.leftTree);
            int rightHeight = heightOfTree(root.rightTree);
            maxDia = Math.max(maxDia, leftHeight + rightHeight + 1);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build Tree
        Node root = BinaryTree.buildTree(nodes);

        // Pre order traversal
        BinaryTree.preorder(root);
        System.out.println();

        // In order traversal
        BinaryTree.inorder(root);
        System.out.println();

        // Post order traversal
        BinaryTree.postorder(root);
        System.out.println();

        // Level order traversal BFS
        BinaryTree.levelorder(root);
        System.out.println();

        // Count of nodes
        System.out.println(BinaryTree.countNodes(root));
        System.out.println();

        // Sum of nodes
        System.out.println(BinaryTree.sumOfNodes(root));
        System.out.println();

        // Height of tree
        System.out.println(BinaryTree.heightOfTree(root));
        System.out.println();

        // Diameter of a tree
        BinaryTree.diameter(root);
        System.out.println(BinaryTree.maxDia);
        System.out.println();
    }
}
