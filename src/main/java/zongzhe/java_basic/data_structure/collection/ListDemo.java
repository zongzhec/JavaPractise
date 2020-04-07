package zongzhe.java_basic.data_structure.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {

        checkAddFunctions(); // 增
        checkRemoveFunc(); // 删
        checkQueryFunc(); // 查
        checkSetFunc(); // 改
        checkIterFunc(); // 遍历

    }

    private static void checkAddFunctions() {
        List list = new ArrayList();
        list.add("one element");
        list.add(0, "another element"); // 在指定位置添加元素

        List list2 = new ArrayList();
        list2.add("list2 element1");
        list2.add("list2 element2");

        list.addAll(1, list2); // 在指定位置添加集合，千万不要写成list.add(1, list2)

        for (Object o : list) {
            System.out.println("element: " + o);
        }
    }

    private static void checkRemoveFunc() {
        List list = new ArrayList();
        list.add("one element");
        list.add("another element");

        list.remove(0);

        for (Object o : list) {
            System.out.println("element: " + o);
        }
    }

    private static void checkSetFunc() {
        List list = new ArrayList();
        list.add("one element");
        list.add("another element");

        list.set(0, "updated element");

        for (Object o : list) {
            System.out.println("element: " + o);
        }
    }

    private static void checkQueryFunc() {
        List list = new ArrayList();
        list.add("one element");
        list.add("another element");
        list.add("another element");

        System.out.println("value of first index: " + list.get(0));
        System.out.println("first index of another element: " + list.indexOf("another element"));
        System.out.println("last index of another element: " + list.lastIndexOf("another element"));
    }

    private static void checkIterFunc() {
        List list = new ArrayList();
        list.add("one element");
        list.add("another element");
        list.add("third element");

        ListIterator iter = list.listIterator();
        // 往后遍历
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }

        // 往前遍历
        iter = list.listIterator(list.size()); // 看到index，可以意识到我们其实可以从任意位置开始遍历
        while (iter.hasPrevious()) {
            Object prev = iter.previous();
            System.out.println(prev);
        }
    }
}
