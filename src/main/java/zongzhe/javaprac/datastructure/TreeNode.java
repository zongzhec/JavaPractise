package zongzhe.javaprac.datastructure;

public class TreeNode {

    private int nodeValue;
    private int nodeParent;

    public TreeNode(int value, int parent) {
        nodeValue = value;
        nodeParent = parent;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public int getNodeParent() {
        return nodeParent;
    }

    public void setNodeValue(int value) {
        nodeValue = value;
    }

    public void setNodeParent(int parent) {
        nodeParent = parent;
    }
}
