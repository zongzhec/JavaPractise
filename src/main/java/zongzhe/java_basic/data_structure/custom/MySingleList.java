package zongzhe.java_basic.data_structure.custom;

import java.util.Arrays;

/**
 * 自定义单向链表
 * 底层不是用数组，而是用节点类型
 */
public class MySingleList {

    private Node first; // 只记第一个节点
    private int total;

    // 设计节点类型，设计成内部类
    class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(Object obj) {
        // 检查是否是第一个
        if (first == null) {
            first = new Node(obj, null);
        } else {
            // 先找到最后一个，再把Node放到当前最后一个的next中
            Node now = first;
            while (now.next != null) {
                now = now.next;
            }
            now.next = new Node(obj, null);
        }
        total++; // 别忘了++
    }

    /**
     * 设计思路：“删除”其实就是把左边节点的“next”直接指到右边节点，“跳过”被删除的节点。
     * 要得到左边节点，就要先判断有没有左边节点。即，被删除的节点是不是第一个节点。
     * 在判断“相等”的时候，也要注意空值的判断。
     */
    public void remove(Object obj) {
        if (obj == null) {
            if (first.data == null) {
                first = first.next;
            } else {
                Node left = first;
                while (left.next.data != null) {
                    left = left.next;
                }
                left.next = left.next.next;
            }
        } else {
            if (obj.equals(first.data)) {
                first = first.next;
            } else {
                Node left = first;
                while (obj.equals(left.next.data)) {
                    left = left.next;
                }
                left.next = left.next.next;
            }
        }
        total--;
    }


    public Object[] toArray() {
        Node now = first;
        Object[] all = new Object[total];
        for (int i = 0; i < all.length; i++) {
            all[i] = now.data;
            now = now.next;
        }
        return all;
    }

    public int size() {
        return total;
    }
}
