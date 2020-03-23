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
 * <p>
 * 接口和类是同一个级别的概念。
 * <p>
 * 接口的成员：
 * JDK1.8之前：全局的静态的常量；公共的抽象的方法。
 * JDK1.8及以后：增加了两类成员：静态方法，默认方法。
 * <p>
 * 说明：接口没有构造器、代码块、除了全局的静态敞亮以外的普通属性。
 * <p>
 * 接口的特点：
 * 1. 实现类在实现接口时，必须实现接口的所有抽象方法，，否则这个实现类必须是个抽象类。
 * 2. 一个类可以同时实现多个接口
 * 3. 接口不能直接创建对象；
 * 4. 接口可以与实现类的对象构成多态引用。
 * 5. 一个类可以同时继承父类，又实现接口。
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
