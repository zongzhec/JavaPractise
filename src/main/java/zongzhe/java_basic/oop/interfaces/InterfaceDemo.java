package zongzhe.java_basic.oop.interfaces;


/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=226">学习视频</a>
 * @see <a href="https://github.com/zongzhec/JavaPractise">源代码</a>
 * <p>
 * 接口
 * <p>
 * 接口代表一种标准。
 * <p>
 * 现有范例：
 * 例如JDBC（Java Database Connectivity）用于Java链接各种数据库。
 * 数据库有很多种：sql, server, access, mysql, oracle, redis, mangodb..
 * 这些数据库是由不同的公司来生产，开发的。
 * Java程序：去链接不同的数据库时，使用相同的代码。
 * Java链接和操作mysql数据库的代码，同样可以用来链接和操作oracle数据库
 * 希望这个Java代码具有通用性，那么Java就要指定一个标准。
 * <p>
 * 这些标准通常就是一些接口，这些借口公布出来，由哥哥数据库的厂商来实现它：Connection，Statement等。
 * 这些实现类，通过jar更换就可以实现，而编程的代码中，面向接口编程。
 * <p>
 * 自主实现：
 * 现在要设计一个数组的工具类MyArrays，这个工具类有一个方法，可以为任意的对象数组进行排序。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable f = new Bird();
        f.fly();

        Student stu1 = new Student("zong", 90);
        Student stu2 = new Student("zhe", 88);
        System.out.println(stu1.compareTo(stu2));

        Student[] arr = new Student[3];
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = new Student("zongzhe", 99);
        Student.sort(arr);
        System.out.println(arr[0].getScore());

    }
}

interface Flyable {
    int MAX_VALUE = 790000;
    int MIN_VALUE = 0;

    void fly();
}

interface Jumpable {
    int MAX_VALUE = 790000;
    int MIN_VALUE = 0;

    void jump();
}

class Bird implements Flyable, Jumpable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void jump() {
        System.out.println("Bird is jumping");
    }
}
