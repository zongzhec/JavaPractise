package foo.zongzhe.prac.tree;

public class StartingPoint {

    public static void main(String args[]) {
        // create binary tree
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        // check if value exists
        System.out.println("value 4 exists? " + bt.containsValue(4));
        System.out.println("value 8 exists? " + bt.containsValue(8));
        System.out.println("value 13 exists? " + bt.containsValue(13));

        // check if delete process works fine
        bt.delete(8);
        System.out.println("value 8 exists? " + bt.containsValue(8));
    }
}
