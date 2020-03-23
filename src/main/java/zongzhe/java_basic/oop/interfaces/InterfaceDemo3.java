package zongzhe.java_basic.oop.interfaces;

/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=236">视频教程</a>
 * @see <a href="https://github.com/zongzhec/JavaPractise">源代码</a>
 * 默认方法的冲突问题：
 * 1. 当一个类调用了多个接口，但其中有方法名签名相同的默认方法。
 * 方法签名：修饰符，返回值类型，方法名（形参列表）
 * 解决方法：
 * （1）保留其中一个接口的默认方法：接口名.super.默认方法
 * （2）直接重写该方法。
 * 2.当一个类继承父类，又继承一个接口，但其中有方法名签名相同的方法。
 * （1）默认保留的是父类
 * （2）手动保留接口的默认方法：接口名.super.默认方法
 * （3）完全重写
 */
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.move();

        Child c = new Child();
        c.move();
    }
}

interface Runnable {
    public default void move() {
        System.out.println("Runnable的默认方法");
    }
}

interface Walkable {
    default void move() {
        System.out.println("Walkable的默认方法");
    }
}

class Person implements Runnable, Walkable {

    @Override
    public void move() {
        Runnable.super.move();
        Walkable.super.move(); // 一般只保留一个
    }
}

class Father {
    public void move() {
        System.out.println("父类的move方法");
    }
}

class Child extends Father implements Runnable {
    // 默认保留父类的方法
}

class Child2 extends Father implements Runnable {
    @Override
    public void move() {
        Runnable.super.move();
    }
}
