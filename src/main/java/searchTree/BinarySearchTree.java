package searchTree;

public class BinarySearchTree {
    int data;
    BinarySearchTree left;
    BinarySearchTree rigth;

    public BinarySearchTree(int data) {
        this.data = data;
        left = null;
        rigth = null;
    }

    // 二分查询 伪代码 加解密 压缩 最优二叉树
    public void insert(BinarySearchTree root, int data) {
        // 根节点小于data 插入右子树
        if (root.data < data) {
            // 判断右子树是否有值，如果没值，直接插入
            if (root.rigth == null) {
                root.rigth = new BinarySearchTree(data);
            } else {
                insert(root.rigth, data);
            }
        } else {
            if (root.left == null) {
                root.left = new BinarySearchTree(data);
            } else {
                insert(root.left, data);
            }
        }
    }

    // 中序遍历 左根右
    public void in(BinarySearchTree root) {
        if (root != null) {
            in(root.left);
            System.out.println(root.data + "");
            in(root.rigth);
        }
    }

    public static void main(String[] args) {
        int data[] = {5, 9, 0, 1, 2, 3, 10};
        BinarySearchTree root = new BinarySearchTree(data[0]);
        for (int i = 1; i < data.length; i++) {
            root.insert(root, data[i]);
        }
        System.out.println("中序遍历为：");
        root.in(root);
    }
}
