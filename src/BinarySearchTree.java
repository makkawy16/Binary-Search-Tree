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

    public boolean contains(int value){
       // if (root == null) return false;
        Node temp = root;
        //if (value == temp.value) return true;
     while (temp != null){
         if (value< temp.value){
             temp = temp.left;
            // if(value == temp.value) return true;


         }else if (value > temp.value){
             temp = temp.right;
             //if (value == temp.value) return true;
         }
         else {
             return true;
         }


     }
     return false;

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
