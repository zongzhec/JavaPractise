package foo.zongzhe.prac.tree;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    Boolean hasLeft(Node node) {
        return !(node.left == null);
    }

    Boolean hasRight(Node node) {
        return !(node.right == null);
    }

    public void printValue(Node node) {
        System.out.println("value is:" + node.value);
    }


}
