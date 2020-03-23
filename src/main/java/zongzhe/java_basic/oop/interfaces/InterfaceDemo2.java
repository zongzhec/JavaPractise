package zongzhe.java_basic.oop.interfaces;


/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=234">视频教程</a>
 * @see <a href="https://github.com/zongzhec/JavaPractise">源代码</a>
 * Interface 在JDK1.8中的新特性：
 * 增加了两类成员：
 * 1. 静态方法：static不可省略，通过“接口名.方法”调用。
 * 说明：接口的静态方法不会继承到实现类，不能用接口的实现类的对象来调用。
 * 2. 默认方法：default不可省略。
 * 用法：当这个接口的抽象方法，在很多实现类里面的实现都是一样的。
 */
public class InterfaceDemo2 {
    public static void main(String[] args) {
        MyInter.print();

        MyImpl mi = new MyImpl();
        mi.test();
        mi.method();
    }
}

interface MyInter {
    String INFO = "static INFO";

    void test(); // 公共的抽象方法

    static void print() { // static 不可省略
        System.out.println("接口的静态方法");
    }

    default void method() {
        System.out.println("接口的默认方法");
    }
}

class MyImpl implements MyInter {

    @Override
    public void test() {
        System.out.println("实现接口的抽象方法");
    }

//    @Override
//    public void method() {
//
//    }
}
