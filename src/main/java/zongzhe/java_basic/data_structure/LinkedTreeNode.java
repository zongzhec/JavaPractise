package zongzhe.java_basic.data_structure;

import java.util.List;

/**
 * Article: https://blog.csdn.net/u011240877/article/details/53193877
 */
public class LinkedTreeNode {


    private int nodeValue; // value to store
    private LinkedTreeNode parentNodeIndex; // Index of parent node
    private List<LinkedTreeNode> childNodeList; // reference of child node

    public LinkedTreeNode(int data, LinkedTreeNode parent) {
        nodeValue = data;
        parentNodeIndex = parent;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public LinkedTreeNode getParentNodeIndex() {
        return parentNodeIndex;
    }

    public void setParentNodeIndex(LinkedTreeNode parentNodeIndex) {
        this.parentNodeIndex = parentNodeIndex;
    }

    public List<LinkedTreeNode> getChildNodeList() {
        return childNodeList;
    }

    public void setChildNodeList(List<LinkedTreeNode> childNodeList) {
        this.childNodeList = childNodeList;
    }


}
