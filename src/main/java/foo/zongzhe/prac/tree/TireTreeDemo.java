package foo.zongzhe.prac.tree;


import foo.zongzhe.prac.tree.TireTree.TireTreeNode;

public class TireTreeDemo {

	public static void main(String[] args) {
		String[] strs = { "banana", "band", "bee", "absolute", "acm" };
		String[] prefix = { "ba", "b", "band", "abc" };

		TireTree tree = new TireTree();
		TireTreeNode root = tree.new TireTreeNode();

		for (String s : strs) {
			tree.createTree(root, s);
		}

		for (String pre : prefix) {
			int num = tree.findCount(root, pre);
			System.out.println(pre + " " + num);
		}
	}

}
