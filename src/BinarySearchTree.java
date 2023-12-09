public class BinarySearchTree {

    private Node root; //top node

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
