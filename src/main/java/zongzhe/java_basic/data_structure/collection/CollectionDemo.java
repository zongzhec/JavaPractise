package zongzhe.java_basic.data_structure.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 用于理解Collection的常用方法。
 */
public class CollectionDemo {

    public static void main(String[] args) {

        checkAddFunctions(); // 添加
        checkDeleteFunctions(); // 删除
        checkIterateFunctions(); // 遍历
        checkOtherFunctions(); // 其他


    }

    private static void checkAddFunctions() {
        Collection c = new ArrayList(); // ArrayList是Collection子接口List的实现类。
        c.add("1st element");
        c.add("2nd element");

        Collection other = new ArrayList();
        other.add("3rd element");
        other.add("4th element");

        c.addAll(other);
        System.out.println("c size: " + c.size());
    }

    private static void checkDeleteFunctions() {
        Collection c = new ArrayList();
        c.add("1st element");
        c.add("2nd element");

        Collection other = new ArrayList();
        other.add("1st element");
        other.add("4th element");

        c.removeAll(other);
        System.out.println("c size: " + c.size());
    }

    private static void checkIterateFunctions() {
        Collection c = new ArrayList();
        c.add("1st element");
        c.add("2nd element");

        for (Object obj : c) {
            System.out.println(obj);
        }
    }

    private static void checkOtherFunctions() {
        Collection c = new ArrayList();
        c.add("1st element");
        c.add("2nd element");

        Collection other = new ArrayList();
        other.add("1st element");
        other.add("4th element");

        c.retainAll(other);
        System.out.println("c size: " + c.size());
    }
}
