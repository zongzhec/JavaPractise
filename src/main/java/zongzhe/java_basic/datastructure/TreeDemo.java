package zongzhe.java_basic.datastructure;


import java.util.List;

public class TreeDemo {
    public static void main(String args[]) {
        TreeParent<String> tp = new TreeParent<>("root");
        TreeParent.Node root = tp.getRoot();
        System.out.println("root: " + root);

        tp.addNode("node1", root);
        System.out.println("tree depth: " + tp.getDepth());

        tp.addNode("node2", root);
        System.out.println("tree depth: " + tp.getDepth());

        // Get all child nodes from root
        List<TreeParent.Node<String>> nodes = tp.getChildNodes(root);
        System.out.println("the first child node of root: " + nodes.get(0));

        // add node for the first child node of root'
        tp.addNode("node3", nodes.get(0));
        System.out.println("tree depth: " + tp.getDepth());
    }
}
