package zongzhe.java_basic.data_structure.generics;

import java.util.ArrayList;

public class GenericDemo {

    public static void main(String[] args) {
        declareGeneric();
    }

    public static void declareGeneric() {
        ArrayList list1 = new ArrayList();
        list1.add("String");
        list1.add(1); // 无法阻止其他类型的加入

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("String");
//        list2.add(1); // 可以阻止int的加入
        for (String str : list2) {
            System.out.println(str); // 取回的值也是String类型
        }

//        ArrayList<int> list3 = new ArrayList<>(); // 报错，集合类型不能用基本数据类型
    }
}

class MyArrayList<E> { // 此处E为类型形参
    private E[] arr;
//    private static E e; // 报错，static不能修饰泛型
}

class Person implements Comparable<Person> {
    private int id;

    @Override
    public int compareTo(Person o) { // 此处便无需使用Object然后强制类型转换了
        return this.id - o.id;
    }
}

class Student<T extends Number> { // 可以指定类型上限，从而做出约束
}
