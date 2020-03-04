package zongzhe.java_basic.datastructure;


import java.util.ArrayList;
import java.util.List;

/**
 * This approach is to point out parent node
 * Article: https://www.cnblogs.com/Dylansuns/p/6791270.html
 */
@SuppressWarnings("unchecked")
public class TreeParent<E> {

    public static class Node<T> {
        T data;
        int parent;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, int parent) {
            this.data = data;
            this.parent = parent;
        }

        public String toString() {
            return "TreeParent$Node[data=" + data + ", parent=" + parent + "]";
        }
    }

    private final int DEFAULT_TREE_SIZE = 10;
    private int treeSize = 0;

    // Use a Node array to store all the nodes in tree
    private Node<E>[] nodes;

    // Store node number
    private int nodeNums;

    // create tree with a defined node
    public TreeParent(E data) {
        treeSize = DEFAULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data, -1);
        nodeNums++;
    }

    // Add new child node for a defined node
    public void addNode(E data, Node parent) {
        for (int i = 0; i < treeSize; i++) {
            // find the first element whose value is null, and make it as new node
            if (nodes[i] == null) {
                // create new node with the given value
                nodes[i] = new Node(data, pos(parent));
                nodeNums++;
                return;
            }
        }
        throw new RuntimeException("This tree is full, cannot add new node");
    }

    // Check if tree is empty
    public boolean isEmpty() {
        return nodes[0] == null;
    }

    // Return root node
    public Node<E> getRoot() {
        return nodes[0];
    }

    // Return the parent node of a given node
    public Node<E> getParent(Node node) {
        return nodes[node.parent];
    }

    // Return all the child nodes
    public List<Node<E>> getChildNodes(Node parent) {
        List<Node<E>> list = new ArrayList<>();
        for (int i = 0; i < treeSize; i++) {
            if (nodes[i] != null && nodes[i].parent == pos(parent)) {
                list.add(nodes[i]);
            }
        }
        return list;
    }

    // Return depth of tree
    public int getDepth() {
        // get the max depth of different ndoes
        int max = 0;
        for (int i = 1; i < treeSize; i++) {
            // initial current node depth
            int curDepth = 1;
            int m = nodes[i].parent;
            while (m != -1 && nodes[m] != null) {
                m = nodes[m].parent;
                curDepth++;
            }
            max = (curDepth > max) ? curDepth : max;
        }
        return max;
    }

    // Return node with given value
    public int pos(Node node) {
        for (int i = 0; i < treeSize; i++) {
            if (nodes[i] == node) {
                return i;
            }
        }
        return -1;
    }

}
