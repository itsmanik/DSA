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
    }
}
