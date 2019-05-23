package foo.zongzhe.prac.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "val: " + val;
	}

	public void visit(TreeNode node) {
		System.out.println(node.val + " ");
	}

	public void preOrderRecursion(TreeNode node) {
		if (node == null) {
			return;
		}
		visit(node);
		preOrderRecursion(node.left);
		preOrderRecursion(node.right);
	}

	public List<Integer> preOrderTraversal(TreeNode root) {
		List<Integer> returnList = new ArrayList<>();
		Stack<TreeNode> treeStack = new Stack<>();
		if (root == null) {
			return returnList;
		}
		treeStack.push(root);
		while (!treeStack.isEmpty()) {
			TreeNode tempNode = treeStack.pop();
			if (tempNode != null) {
				returnList.add(tempNode.val);
				treeStack.push(tempNode.right);
				treeStack.push(tempNode.left);
			}
		}
		return returnList;
	}
}
