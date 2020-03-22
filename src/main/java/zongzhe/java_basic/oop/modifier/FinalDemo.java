package zongzhe.java_basic.oop.modifier;


/**
 * @see <a href="https://www.bilibili.com/video/av83956740?t=4&p=219">https://www.bilibili.com/video/av83956740?t=4&p=219</a>
 * fianl 是一个修饰符
 * 1. 修饰类，包括外部类、内部类：表示这个类不能被继承，比如System类。
 * 2. 修饰方法：表示这个方法可以被继承，但不能被重写，比如Object.getClass。
 * 3. 修饰属性和局部变量：表示它是一个常量，值不能被修改，比如 Math.PI，Math.E（常量名建议大写）。
 * */
public class FinalDemo {
    public static void main(String[] args) {
        final int NUM = 10;
//        NUM = 20; // Error, 不能修改

        MyClass mc = new MyClass(); // mc 是final，不能改写。
        mc.myNum = 20; // myNum 不是final，可以改写。
    }
}

class MyClass{
    int myNum;
}
