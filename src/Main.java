public class Main {
    public static void main(String[] args) {

        System.out.println("root = " + new BinarySearchTree().getRoot());
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);
        bst.insert(9);
        bst.insert(7);
        bst.insert(10);
        System.out.println(bst.getRoot().value); // 5
        System.out.println(bst.getRoot().left.value); // 4
        System.out.println(bst.getRoot().right.value); // 9
        System.out.println(bst.getRoot().left.left.value); // 3
        System.out.println(bst.getRoot().right.right.value); // 10
    }
}