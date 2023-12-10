public class BinarySearchTree {

    private Node root; //top node

    public void insert(int value) {

        Node newNode = new Node(value);
        if (root == null) root = newNode;
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) break;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;
            } else
            {
                if (temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                temp = temp.right;            }
        }
        System.out.println("inserted");
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /*public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;

    }*/

    class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }
}
