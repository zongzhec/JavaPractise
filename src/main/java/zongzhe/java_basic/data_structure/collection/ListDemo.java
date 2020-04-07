package zongzhe.java_basic.data_structure.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        checkListFunctions();
    }

    private static void checkListFunctions() {
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
}
