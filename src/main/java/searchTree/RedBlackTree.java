package searchTree;

public class RedBlackTree {
    private final int B = 1;
    private final int R = 0;

    private Node root;

    class Node {
        int data;
        int color = R;

        Node left;
        Node right;
        Node parent;

        public Node(int data) {
            this.data = data;
        }

        public void insert(Node node) {
            node.color = R; //插入的时候所有的点都要设置为红色
        }

        public void leftRotate(Node node) {
            if (node.parent != null) {

            } else {
                //因为没有父亲结点表示是根节点
                // 根节点左旋
                Node right = root.right;
                root.right = right.left;
                right.left.parent = root;
                root.parent = right;
                right.parent = null;
                root = right;
            }
        }
    }
}
