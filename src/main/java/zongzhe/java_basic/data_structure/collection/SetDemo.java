package zongzhe.java_basic.data_structure.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        checkAddFunc(); // 增
        checkCustomTypeAddFunc(); // 设定自定义类型，深入了解Set的功能
    }

    private static void checkAddFunc() {
        Set set = new HashSet();
        set.add("a"); // 此处是Collection的add方法
        set.add("z");
        set.add("2");
        set.add("a");
        set.add("b");
        printSet(set); // 从打印结果看，没有顺序

        Set treeSet = new TreeSet();
        treeSet.add("a");
        treeSet.add("z");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("b");
        printSet(treeSet); // 从打印结果看，为按照字符顺序输出

    }

    private static void checkCustomTypeAddFunc() {
        Set set = new HashSet();
        set.add(new Person(1, 18, "person a")); // 添加自定义类型
        set.add(new Person(2, 18, "person b"));
        set.add(new Person(3, 18, "person c"));
        set.add(new Person(4, 18, "person d"));
        set.add(new Person(4, 18, "person d"));
        printSet(set); // 从打印结果看，且仅有一个person d

        Set treeSet = new TreeSet();
        treeSet.add(new Person(1, 18, "person a")); // 添加自定义类型
        treeSet.add(new Person(2, 18, "person b"));
        treeSet.add(new Person(3, 18, "person c"));
        treeSet.add(new Person(4, 18, "person d"));
        treeSet.add(new Person(4, 18, "person e"));
        printSet(treeSet); // 从打印结果看，Person按id排序，且person e 没有被添加进去
    }

    private static void printSet(Set set) {
        System.out.println("printing set");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class Person implements Comparable {
    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.id - person.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
