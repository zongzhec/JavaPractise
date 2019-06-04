package foo.zongzhe.prac.tree;

public class TireTree {

	final int MAX_SIZE = 26;

	public class TireTreeNode {
		int nCount;
		char ch;
		TireTreeNode[] child;

		public TireTreeNode() {
			nCount = 1;
			child = new TireTreeNode[MAX_SIZE];
		}
	}

	// Insert and construct
	public void createTree(TireTreeNode node, String str) {
		if (str == null || str.length() == 0) {
			return;
		}
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			int pos = letters[i] - 'a';
			if (node.child[pos] == null) {
				node.child[pos] = new TireTreeNode();
			} else {
				node.child[pos].nCount++;
			}
			node.ch = letters[i];
			node = node.child[pos];
		}
	}

	// Search
	public int findCount(TireTreeNode node, String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			int pos = letters[i] - 'a';

			if (node.child[pos] == null) {
				return 0;
			} else {
				node = node.child[pos];
			}
		}
		return node.nCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
